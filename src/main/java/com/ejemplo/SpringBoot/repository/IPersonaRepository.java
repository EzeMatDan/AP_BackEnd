package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
