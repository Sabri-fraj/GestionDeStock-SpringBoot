package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Client;
import com.sbrfraj.tn.Gestiondestock.Model.CommandeClient;
import com.sbrfraj.tn.Gestiondestock.Model.LigneCommandeClient;
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
public class CommandeClientDto {

    private Integer id;
    private String code;

    private Instant dateCommande;
    @JsonIgnore
    private Client client;

    private Set<LigneCommandeClientDto> ligneCommandeClients;
    public CommandeClientDto FromEntity(CommandeClient commandeClient){
        if (commandeClient == null){
            return null;
        }
        return CommandeClientDto
                .builder()
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();
    }
    public CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if (commandeClientDto == null){
            return null;
        }
        CommandeClient commandeClient =new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        return commandeClient;
    }
}
