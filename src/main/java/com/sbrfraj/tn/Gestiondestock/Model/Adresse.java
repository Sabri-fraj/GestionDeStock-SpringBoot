package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Adresse {
    @Column
    private String adresse1;
    @Column
    private String adresse2;
    @Column
    private String ville ;
    @Column
    private String CodePostale;
    @Column
    private String pays;


}