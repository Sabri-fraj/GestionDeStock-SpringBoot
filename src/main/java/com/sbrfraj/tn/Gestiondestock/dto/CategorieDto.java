package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Categorie;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Data
@Getter
@Setter
@Builder
public class CategorieDto {

    private Integer id;
    private String code ;
    private String designation;
    @JsonIgnore
    private Set<ArticleDto> articles;
    // CategorieDto ---> Categorie
    public  CategorieDto fromEntity(Categorie categorie){
        if (categorie == null) {
          return null;
        }

        return CategorieDto
                .builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }
    //Categorie ---> CategorieDto
    public Categorie toCategorie(CategorieDto categorieDto){
        if (categorieDto == null){
            return null;
        }
        Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCode(categorieDto.getCode());
        categorie.setDesignation(categorieDto.getDesignation());
        return categorie;

    }
}