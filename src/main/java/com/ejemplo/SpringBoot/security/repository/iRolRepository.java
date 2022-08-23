package com.ejemplo.SpringBoot.security.repository;

import com.ejemplo.SpringBoot.security.entity.Rol;
import com.ejemplo.SpringBoot.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
