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
public class Vente extends AbstractEntity{
    @Column
    private String codeVente;

    @OneToMany(mappedBy = "vente")
    private Set<LigneVente> ligneVentes;
}
