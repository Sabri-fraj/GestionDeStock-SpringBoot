package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Article;
import com.sbrfraj.tn.Gestiondestock.Model.CommandeClient;
import com.sbrfraj.tn.Gestiondestock.Model.LigneCommandeClient;
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
public class LigneCommandeClientDto {

    private Integer id;

    private String codeLigComCli;
    @JsonIgnore
    private CommandeClient commandeClient;
    @JsonIgnore
    private ArticleDto article;
    public LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient){
        
        if (ligneCommandeClient == null){
            return null;
        }
        
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .codeLigComCli(getCodeLigComCli())
                .build();
    }
    public  LigneCommandeClient toEtity(LigneCommandeClientDto ligneCommandeClientDto){

        if (ligneCommandeClientDto == null){
            return null;
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setCodeLigComCli(ligneCommandeClientDto.getCodeLigComCli());
        ligneCommandeClient.setId(ligneCommandeClientDto.getId());
        return null;
    }
}
