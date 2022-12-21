package com.backbanzaiflix.backbanzaiflix.repositorys;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backbanzaiflix.backbanzaiflix.models.UsuarioModel;




@Repository

public interface UsuarioRepository extends JpaRepository<UsuarioModel,UUID> {
    UsuarioModel findBynome(String nome);
    
}
