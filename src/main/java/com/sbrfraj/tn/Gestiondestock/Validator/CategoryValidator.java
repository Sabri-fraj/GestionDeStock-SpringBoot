package com.sbrfraj.tn.Gestiondestock.Validator;

import com.sbrfraj.tn.Gestiondestock.dto.CategorieDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategorieDto categorieDto){

        List<String> errors = new ArrayList<>();
        if( categorieDto == null || StringUtils.hasLength(categorieDto.getCode())){
            errors.add("veuillez renseigner le code de la categorie");
        }

     return  errors;
    }
}
