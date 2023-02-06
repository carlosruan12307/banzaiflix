package com.banzaiflix_backend.banzaiflix_backend.repositorys;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banzaiflix_backend.banzaiflix_backend.Enums.CategoriaEnum;
import com.banzaiflix_backend.banzaiflix_backend.models.FIlmes.FilmModel;

public interface FilmRepository extends JpaRepository<FilmModel, UUID> {
    List<FilmModel> findAllByCategoria(CategoriaEnum categoria);
}
