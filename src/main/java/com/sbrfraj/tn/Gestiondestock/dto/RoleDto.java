package com.sbrfraj.tn.Gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbrfraj.tn.Gestiondestock.Model.Role;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class RoleDto {

    private Integer id;
    private String typeRole;
    @JsonIgnore
    private UtilisateurDto utilisateur;

    public RoleDto fromEntity(Role role){
        if (role == null){
            return null;
        }

        return RoleDto.builder()
                .id(role.getId())
                .typeRole(role.getTypeRole())
                .build();
    }
    public Role toEntity(RoleDto roleDto){
        if (roleDto == null){
            return null;
        }
        Role role = new Role();
        role.setTypeRole(roleDto.getTypeRole());
        role.setId(roleDto.getId());
        return role;
    }
}
