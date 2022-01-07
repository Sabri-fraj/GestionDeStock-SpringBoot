package com.sbrfraj.tn.Gestiondestock.Validator;

import com.sbrfraj.tn.Gestiondestock.dto.UtilisateurDto;
import org.springframework.http.server.reactive.AbstractListenerWriteFlushProcessor;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValiator {
    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();

            //okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
        if (utilisateurDto == null){
            errors.add("veuillez renseigner nom d'utilisateur");
            errors.add( "veuillez renseigner prenom d'utilisateur");
            errors.add("veuillez renseigner le mot de passe d'utilisateur");
            errors.add("veuillez renseigner l'adresse d'utilisateur");
        }


        if (utilisateurDto.getId() == null){
             errors.add(" merci de verifier le code des etuisateurs");
        }
        if (!StringUtils.hasLength(utilisateurDto.getNom()) || utilisateurDto.getNom() == null){
            errors.add("veuillez renseigner nom d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add( "veuillez renseigner prenom d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("le champs Email est obligatoire");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("veuillez renseigner le mot de passe d'utilisateur");
        }
        if (utilisateurDto.getAdresse() ==null){
            errors.add("veuillez renseigner l'adresse d'utilisateur");
        }
        else {
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1() )){
                errors.add(" le champs 'adresse 1'est obligatoir");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse2())){
                errors.add("le champs adresse 2 est obligatoire");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())){
                errors.add("le champs code postale est obigatoire");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
                errors.add("le champs pays est obligatoire");
            }
            if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
                errors.add("le champs ville est obligatoire");
            }
        }
        return errors;
    }
}
