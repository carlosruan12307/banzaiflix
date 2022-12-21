package com.backbanzaiflix.backbanzaiflix.models;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;

import com.backbanzaiflix.backbanzaiflix.enums.RoleEnum;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "role")
public class RoleModel implements GrantedAuthority {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idRole;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleEnum nome;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private List<UsuarioModel> usuarios;
    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
        return nome.toString();
    }

   
    public RoleModel( RoleEnum nome) {
        this.nome = nome;
    }
    public RoleModel(){}

    
}
