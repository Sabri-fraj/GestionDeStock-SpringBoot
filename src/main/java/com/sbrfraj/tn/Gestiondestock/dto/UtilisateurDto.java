package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Adresse;
import com.sbrfraj.tn.Gestiondestock.Model.Entreprise;
import com.sbrfraj.tn.Gestiondestock.Model.Role;
import com.sbrfraj.tn.Gestiondestock.Model.Utilisateur;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;
@Getter
@Setter
@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String email;

    private String Tel;

    private Instant DateNaissance;

    private String MotDePasse;
    @JsonIgnore
    private EntrepriseDto entreprise;
    @JsonIgnore
    private Set<RoleDto> roles;

    public UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur == null){
            return null;
        }

        return UtilisateurDto.builder()
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .adresse(utilisateur.getAdresse())
                .DateNaissance(utilisateur.getDateNaissance())
                .email(utilisateur.getEmail())
                .MotDePasse(utilisateur.getMotDePasse())
                .Tel(utilisateur.getTel())
                .photo(utilisateur.getPhoto())
                .build();
    }
    public Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto == null){
            return null;
        }
        Utilisateur utilisateur =new Utilisateur();
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setAdresse(utilisateurDto.getAdresse());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setDateNaissance(utilisateurDto.getDateNaissance());
        utilisateur.setTel(utilisateurDto.getTel());
        utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
        return utilisateur;
    }
}
