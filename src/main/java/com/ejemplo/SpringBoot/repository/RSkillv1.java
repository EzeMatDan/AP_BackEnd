
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.entity.Skillv1;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkillv1 extends JpaRepository<Skillv1, Integer> {
    public Optional <Skillv1> findByTitle(String title);
    public boolean existsByTitle(String title);
    public Optional <Skillv1> findByPorcentaje(int porcentaje);
    public boolean existsByPorcentaje(int porcentaje);
}
