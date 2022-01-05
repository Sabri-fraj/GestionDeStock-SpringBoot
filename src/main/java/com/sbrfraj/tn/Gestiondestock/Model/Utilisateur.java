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
public class Utilisateur extends AbstractEntity {


    @Column(name=" nom")
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
    @Column
    private Instant DateNaissance;
    @Column
    private String MotDePasse;

    @ManyToOne()
    @JoinColumn(name = "IDEntreprise",nullable = false)
    private Entreprise entreprise;
    @OneToMany(mappedBy = "utilisateur")
    private Set<Role> roles;
}
