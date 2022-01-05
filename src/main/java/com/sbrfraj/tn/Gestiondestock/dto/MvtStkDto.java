package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Article;
import com.sbrfraj.tn.Gestiondestock.Model.MvtStk;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Getter
@Setter
@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private String codeMvtStk;
    @JsonIgnore
    private ArticleDto article;

    public MvtStkDto fromEntity(MvtStk mvtStk){
        if (mvtStk == null){
            return null;
        }

        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .codeMvtStk(mvtStk.getCodeMvtStk())
                .build();
    }
    public MvtStk toEntity(MvtStkDto mvtStkDto){

        if ( mvtStkDto == null){
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setCodeMvtStk(mvtStkDto.getCodeMvtStk());
        mvtStk.setId(mvtStkDto.getId());
        return mvtStk;
    }
}
