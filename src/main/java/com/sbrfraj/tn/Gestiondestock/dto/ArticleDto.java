package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@Data
@Builder
public class ArticleDto {

    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;

    @JsonIgnore
    private Categorie categorie;
    @JsonIgnore
    private Set<LigneCommandeClient> ligneCommandeClients;
    @JsonIgnore
    private Set<MvtStk> mvtStks ;
    @JsonIgnore
    private Set<LigneVente> ligneVentes;
    @JsonIgnore
    private Set<LigneCommandeFournisseur> ligneCommandeFournisseurs;
    @JsonIgnore
    private Entreprise entreprise;

    public ArticleDto fromEntity( Article article ){

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .tauxTva(article.getTauxTva())
                .build();
    }
    public Article toEntity( ArticleDto articleDto){


        Article article = new Article();
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setId(articleDto.getId());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(getPrixUnitaireTtc());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPhoto(articleDto.getPhoto());
        return  article;
    }
}
