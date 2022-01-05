package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class LigneVente extends AbstractEntity{

    @Column(name = "quantity")
    private BigDecimal quantity;

    @ManyToOne()
    @JoinColumn(name = "IDVente",nullable = false)
    private Vente vente;

    @ManyToOne()
    @JoinColumn(name = "IDArticle",nullable = false)
    private Article article;
}
