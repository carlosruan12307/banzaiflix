package com.banzaiflix_backend.banzaiflix_backend.models.FIlmes;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "filme")
public class FilmeModel {
    @Id
    @GeneratedValue()
    private UUID id;
    
    private String url;

    private String name;

    private String description;

    private String title;
}
