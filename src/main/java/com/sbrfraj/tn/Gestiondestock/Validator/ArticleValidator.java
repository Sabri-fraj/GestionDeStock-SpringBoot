package com.sbrfraj.tn.Gestiondestock.Validator;

import com.sbrfraj.tn.Gestiondestock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    ///juhsfushkufhsik
    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTtc;
    private String photo;
    //ypuyèiyiyuu
    public static List<String> validator(ArticleDto articleDto){
        List<String> error = new ArrayList<>();

        if(articleDto == null){
            error.add("veuillez renseigner le cade d'article");
            error.add("veuillez renseigner la designation");
            error.add("veuillez renseigner le prix Unitaire Ht");
            error.add("veuillez renseigner le taux Tva");
            error.add("veuillez renseigner le prix Unitaire Ttc");
            error.add("veuillez renseigner le photo");
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            error.add("veuillez renseigner le cade d'article");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            error.add("veuillez renseigner la designation");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            error.add("veuillez renseigner le taux Tva");
        }

        return error;
    }
}
