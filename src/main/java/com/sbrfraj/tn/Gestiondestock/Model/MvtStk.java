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
public class MvtStk extends AbstractEntity{
    @Column(name = "codeMvtStk")
    private String codeMvtStk;

    @ManyToOne()
    @JoinColumn(name = "IDArticle",nullable = false)
    private Article article;
}
