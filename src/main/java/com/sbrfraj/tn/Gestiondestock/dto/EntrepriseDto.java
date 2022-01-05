package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Article;
import com.sbrfraj.tn.Gestiondestock.Model.Entreprise;
import com.sbrfraj.tn.Gestiondestock.Model.Utilisateur;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Builder
@Getter
@Setter
public class EntrepriseDto {

    private Integer id;
    private String codeEntreprise;
    @JsonIgnore
    private Set<UtilisateurDto> utilisateurs;
    @JsonIgnore
    private Set<ArticleDto> articles;

    public EntrepriseDto fromEntity(Entreprise entreprise){
        if (entreprise == null){
            return null;
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .codeEntreprise(entreprise.getCodeEntreprise())
                .build();
    }
    public Entreprise toEntity(EntrepriseDto entrepriseDto){
        if (entrepriseDto == null) {

        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setCodeEntreprise(entrepriseDto.getCodeEntreprise());
        return null;
    }
}
