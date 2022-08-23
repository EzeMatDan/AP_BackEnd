
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.entity.CircleProgress;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCircleProgress extends JpaRepository<CircleProgress, Integer> {
    public Optional <CircleProgress> findByPorcentaje(int porcentaje);
    public boolean existsByPorcentaje(int porcentaje);
    
     public Optional <CircleProgress> findByPorcentaje1(int porcentaje1);
    public boolean existsByPorcentaje1(int porcentaje1);
    
      public Optional <CircleProgress> findByPorcentaje2(int porcentaje2);
    public boolean existsByPorcentaje2(int porcentaje2);
    
      public Optional <CircleProgress> findByPorcentaje3(int porcentaje3);
    public boolean existsByPorcentaje3(int porcentaje3);
    
      public Optional <CircleProgress> findByPorcentaje4(int porcentaje4);
    public boolean existsByPorcentaje4(int porcentaje4);
    
      public Optional <CircleProgress> findByPorcentaje5(int porcentaje5);
    public boolean existsByPorcentaje5(int porcentaje5);
    
      public Optional <CircleProgress> findByPorcentaje6(int porcentaje6);
    public boolean existsByPorcentaje6(int porcentaje6);
    
      public Optional <CircleProgress> findByPorcentaje7(int porcentaje7);
    public boolean existsByPorcentaje7(int porcentaje7);
    
      public Optional <CircleProgress> findByPorcentaje8(int porcentaje8);
    public boolean existsByPorcentaje8(int porcentaje8);
    
      public Optional <CircleProgress> findByPorcentaje9(int porcentaje9);
    public boolean existsByPorcentaje9(int porcentaje9);
    
      public Optional <CircleProgress> findByPorcentaje10(int porcentaje10);
    public boolean existsByPorcentaje10(int porcentaje10);
    
      public Optional <CircleProgress> findByPorcentaje11(int porcentaje11);
    public boolean existsByPorcentaje11(int porcentaje11);
}
