package com.sbrfraj.tn.Gestiondestock.Validator;

import com.sbrfraj.tn.Gestiondestock.dto.CategorieDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategorieDto categorieDto){

        List<String> errors = new ArrayList<>();
        if(categorieDto != null || StringUtils.hasLength(categorieDto.getCode())){
            errors.add("veuillez renseigner le code de la categorie");
        }
        if(categorieDto != null || StringUtils.hasLength(categorieDto.getDesignation())){
            errors.add("veuillez renseigner le Designation de la categorie");
        }
        if (categorieDto.getId() == null){
            errors.add("veuillez verifier le code de categorie");
        }
     return  errors;
    }
}
