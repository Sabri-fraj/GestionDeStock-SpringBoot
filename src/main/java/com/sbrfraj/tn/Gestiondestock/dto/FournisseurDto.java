package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Adresse;
import com.sbrfraj.tn.Gestiondestock.Model.CommandeFournisseur;
import com.sbrfraj.tn.Gestiondestock.Model.Entreprise;
import com.sbrfraj.tn.Gestiondestock.Model.Fournisseur;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.Set;
@Getter
@Setter
@Data
@Builder
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String email;

    private String Tel;
    @JsonIgnore
    private Set<CommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur){
        if (fournisseur == null) {
        return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adresse(fournisseur.getAdresse())
                .email(fournisseur.getEmail())
                .photo(fournisseur.getPhoto())
                .Tel(fournisseur.getTel())
                .build();
    }
    public Fournisseur toEntity(FournisseurDto fournisseurDto){

        if (fournisseurDto == null) {
        return null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setEmail(fournisseurDto.getEmail());
        fournisseur.setAdresse(fournisseurDto.getAdresse());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setTel(fournisseurDto.getTel());
        return fournisseur;
    }
}
