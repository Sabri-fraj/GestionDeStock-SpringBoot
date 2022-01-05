package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.CommandeFournisseur;
import com.sbrfraj.tn.Gestiondestock.Model.Fournisseur;
import com.sbrfraj.tn.Gestiondestock.Model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.Set;
@Getter
@Setter
@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;
    private String code;

    private Instant dateComande;
    @JsonIgnore
    private FournisseurDto fournisseur;
    @JsonIgnore
    private Set<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    public CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if (commandeFournisseur == null){
            return null;
        }
        return CommandeFournisseurDto.builder()
                .code(commandeFournisseur.getCode())
                .dateComande(commandeFournisseur.getDateComande())
                .id(commandeFournisseur.getId())
                .build();
    }
    public CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto){
        if (commandeFournisseurDto ==null){
            return null;
        }
        CommandeFournisseur commandeFournisseur =new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateComande(commandeFournisseurDto.getDateComande());
        return commandeFournisseur;
    }
}
