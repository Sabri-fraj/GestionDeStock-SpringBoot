package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Article;
import com.sbrfraj.tn.Gestiondestock.Model.LigneVente;
import com.sbrfraj.tn.Gestiondestock.Model.Vente;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
@Getter
@Setter
@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private BigDecimal quantity;
    @JsonIgnore
    private VenteDto vente;
    @JsonIgnore
    private ArticleDto article;

    public LigneVenteDto fromEntity (LigneVente ligneVente){
        if (ligneVente == null){
            return null;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantity(ligneVente.getQuantity())
                .build();
    }
    public LigneVente toEntity(LigneVenteDto ligneVenteDto){

        if (ligneVenteDto == null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantity(ligneVenteDto.getQuantity());
        return ligneVente;
    }
}
