package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Fournisseur extends AbstractEntity {
    @Column
    private String nom;
    @Column
    private String prenom;
    @Embedded
    private Adresse adresse;
    @Column
    private String photo;
    @Column
    private String email;
    @Column
    private String Tel;


    @OneToMany(mappedBy = "fournisseur")
    private Set<CommandeFournisseur> commandeFournisseurs;
}
