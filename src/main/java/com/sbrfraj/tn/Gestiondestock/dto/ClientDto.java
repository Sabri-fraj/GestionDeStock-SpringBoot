package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Adresse;
import com.sbrfraj.tn.Gestiondestock.Model.Client;
import com.sbrfraj.tn.Gestiondestock.Model.CommandeClient;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.Set;
@Getter
@Setter
@Data
@Builder
public class ClientDto {

    private Integer id;
    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String Tel;
    @JsonIgnore
    private Set<CommandeClientDto> commandeClients;

    //from DTO to Entity
    public ClientDto fromEntity(Client client){
        if (client==null){
            return  null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .email(client.getEmail())
                .nom(client.getNom())
                .photo(client.getPhoto())
                .prenom(client.getPrenom())
                .Tel(client.getTel())
                .build();
    }
    public Client toEntity (ClientDto clientDto){
        if (clientDto == null){
            return null;
        }
        Client client = new Client();
        client.setEmail(clientDto.getEmail());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setTel(clientDto.getTel());
        return client;
    }
}
