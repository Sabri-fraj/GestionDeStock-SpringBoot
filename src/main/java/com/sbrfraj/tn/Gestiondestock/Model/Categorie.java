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
@Table(name = "categorie")

public class Categorie extends AbstractEntity {


    @Column
    private String code ;
    @Column
    private String designation;

    @OneToMany(mappedBy = "categorie")
    private Set<Article> articles;
}
