package com.banzaiflix_backend.banzaiflix_backend.repositorys;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banzaiflix_backend.banzaiflix_backend.Enums.RoleEnum;
import com.banzaiflix_backend.banzaiflix_backend.models.Usuarios.RoleModel;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel,UUID> {

    Optional<RoleModel> findByname(RoleEnum roleEnum);
}
