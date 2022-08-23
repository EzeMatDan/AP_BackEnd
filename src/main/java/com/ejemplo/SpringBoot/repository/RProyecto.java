package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RProyecto extends JpaRepository<Proyecto,Integer> {
    public Optional<Proyecto> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);
}