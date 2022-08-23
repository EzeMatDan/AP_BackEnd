
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcerca extends JpaRepository<Acerca, Integer> {
       public Optional<Acerca> findByNombreA (String nombreA);
       public boolean existsByNombreA(String nombreA);
}
