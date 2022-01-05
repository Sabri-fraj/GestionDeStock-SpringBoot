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
public class CommandeFournisseur extends AbstractEntity{

    @Column(name = "code")
    private String code;
    @Column(name = "datecommande")
    private Instant dateComande;

    @ManyToOne()
    @JoinColumn(name = "IDFournisseur",nullable = false)
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private Set<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
