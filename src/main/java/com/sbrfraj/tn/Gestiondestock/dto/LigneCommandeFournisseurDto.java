package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Article;
import com.sbrfraj.tn.Gestiondestock.Model.CommandeFournisseur;
import com.sbrfraj.tn.Gestiondestock.Model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Getter
@Setter
@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private String codeLigComFou;
    @JsonIgnore
    private CommandeFournisseurDto commandeFournisseur ;
    @JsonIgnore
    private ArticleDto article;

    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){
        if (ligneCommandeFournisseur == null){
            return null;
        }

        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .codeLigComFou(ligneCommandeFournisseur.getCodeLigComFou())
                .build();
    }
    public LigneCommandeFournisseur toEntity( LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
        if (ligneCommandeFournisseurDto == null){
            return null;
        }
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        ligneCommandeFournisseur.setCodeLigComFou(ligneCommandeFournisseurDto.getCodeLigComFou());
        return ligneCommandeFournisseur;
    }

}
