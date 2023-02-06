package com.banzaiflix_backend.banzaiflix_backend.models.FIlmes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.banzaiflix_backend.banzaiflix_backend.Enums.CategoriaEnum;
import com.banzaiflix_backend.banzaiflix_backend.models.Usuarios.UserModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "filme")
public class FilmModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private CategoriaEnum categoria;

    private String url;

    private String name;

    private String description;
    @ManyToMany(mappedBy = "favoritos")
    @JsonBackReference
    List<UserModel> usuarios;

    public FilmModel() {

    }

    public FilmModel(String url, String name, String description, CategoriaEnum categoria) {
        this.categoria = categoria;
        this.url = url;
        this.name = name;
        this.description = description;
    }

    public FilmModel(Integer id, String url, String name, String description) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.description = description;
    }

}
