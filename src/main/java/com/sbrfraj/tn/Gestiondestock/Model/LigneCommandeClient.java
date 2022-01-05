package com.sbrfraj.tn.Gestiondestock.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class LigneCommandeClient extends AbstractEntity{
    @Column(name = "codeLigComCli")
    private String codeLigComCli;

    @ManyToOne()
    @JoinColumn(name = "IDCommandeClient",nullable = false)
    private CommandeClient commandeClient;

    @ManyToOne()
    @JoinColumn(name = "IDArticle",nullable = false)
    private Article article;
}
