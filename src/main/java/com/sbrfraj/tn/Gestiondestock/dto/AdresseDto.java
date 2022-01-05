package com.sbrfraj.tn.Gestiondestock.dto;

import com.sbrfraj.tn.Gestiondestock.Model.Adresse;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@Builder
public class AdresseDto {
    private Integer id;
    private String adresse1;
    private String adresse2;
    private String ville ;
    private String CodePostale;
    private String pays;

    public AdresseDto FromEntity (Adresse adresse){
        if(adresse == null){
            return  null;

        }
        return AdresseDto
                .builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .CodePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .ville(adresse.getVille())
                .build();

    }
    // from DTO to entity
    public Adresse toAntity(AdresseDto adresseDto){
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        adresse.setVille(adresseDto.getVille());
        return adresse;
    }
}
