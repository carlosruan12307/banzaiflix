package com.banzaiflix_backend.banzaiflix_backend.models.Usuarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.banzaiflix_backend.banzaiflix_backend.models.FIlmes.FilmModel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class UserModel implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, name = "username", unique = true)
    @NotBlank
    private String username;
    @Column(nullable = false, name = "senha", unique = true)
    @NotBlank
    private String password;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usuario_filme", joinColumns = @JoinColumn(name = "usuario"), inverseJoinColumns = @JoinColumn(name = "filme"))
    List<FilmModel> favoritos = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "usuario", referencedColumnName = "username"), inverseJoinColumns = @JoinColumn(name = "role", referencedColumnName = "name"))
    @JsonManagedReference
    List<RoleModel> roles = new ArrayList<>();

    public UserModel() {

    }

    public UserModel(@NotBlank String username, @NotBlank String password) {
        this.username = username;
        this.password = password;
    }

    public void addRole(RoleModel roleModel) {
        roles.add(roleModel);
    }

    public void addfilm(FilmModel filmModel) {
        favoritos.add(filmModel);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return this.roles;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
}
