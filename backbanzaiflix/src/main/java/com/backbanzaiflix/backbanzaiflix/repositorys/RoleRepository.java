package com.backbanzaiflix.backbanzaiflix.repositorys;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backbanzaiflix.backbanzaiflix.enums.RoleEnum;
import com.backbanzaiflix.backbanzaiflix.models.RoleModel;



@Repository
public interface RoleRepository extends JpaRepository<RoleModel,UUID> {

    Optional<RoleModel> findBynome(RoleEnum nome);

  
    
}
