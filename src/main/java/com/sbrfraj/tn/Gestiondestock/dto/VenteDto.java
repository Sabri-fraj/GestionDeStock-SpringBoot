package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.LigneVente;
import com.sbrfraj.tn.Gestiondestock.Model.Vente;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Set;
@Getter
@Setter
@Data
@Builder
public class VenteDto {

    private Integer id;
    private String codeVente;

    @JsonIgnore
    private Set<LigneVenteDto> ligneVentes;

    public VenteDto fromEntity(Vente vente){
        if (vente == null){
            return null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .codeVente(vente.getCodeVente())
                .build();
    }
    public Vente toEntity(VenteDto venteDto){
        if (venteDto == null){
            return null;
        }
        Vente vente = new Vente();
        vente.setCodeVente(venteDto.getCodeVente());
        vente.setId(venteDto.getId());
        return vente;
    }
}
