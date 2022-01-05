package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class CommandeClient  extends AbstractEntity{

    @Column(name = "code")
    private String code;
    @Column(name = "datecommande")
    private Instant dateCommande;

    @ManyToOne()
    @JoinColumn(name = "IDClient",nullable = false)
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private Set<LigneCommandeClient> ligneCommandeClients;
}
