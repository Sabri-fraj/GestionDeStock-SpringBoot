package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Role extends AbstractEntity {

    @Column(name = "typeRole")
    private String typeRole;

    @ManyToOne()
    @JoinColumn(name = "IDUtilisateur")
    private Utilisateur utilisateur;
}
