
package com.ejemplo.SpringBoot.service;


import com.ejemplo.SpringBoot.entity.CircleProgress;
import com.ejemplo.SpringBoot.repository.RCircleProgress;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCircleProgress {
    
        @Autowired
    RCircleProgress rCircleProgress;
    
    public List<CircleProgress> list() {
        return rCircleProgress.findAll();
    }
    
    public Optional<CircleProgress> getOne(int id){
        return rCircleProgress.findById(id);
    }
    
    public Optional<CircleProgress> getByPorcentaje(int porcentaje){
        return rCircleProgress.findByPorcentaje(porcentaje);
    }
    
    public Optional<CircleProgress> getByPorcentaje1(int porcentaje1){
    return rCircleProgress.findByPorcentaje1(porcentaje1);
    }
    
        public Optional<CircleProgress> getByPorcentaje2(int porcentaje2){
    return rCircleProgress.findByPorcentaje1(porcentaje2);
    }
    
        public Optional<CircleProgress> getByPorcentaje3(int porcentaje3){
    return rCircleProgress.findByPorcentaje1(porcentaje3);
    }
    
        public Optional<CircleProgress> getByPorcentaje4(int porcentaje4){
    return rCircleProgress.findByPorcentaje1(porcentaje4);
    }
    
        public Optional<CircleProgress> getByPorcentaje5(int porcentaje5){
    return rCircleProgress.findByPorcentaje1(porcentaje5);
    }
    
        public Optional<CircleProgress> getByPorcentaje6(int porcentaje6){
    return rCircleProgress.findByPorcentaje1(porcentaje6);
    }
    
        public Optional<CircleProgress> getByPorcentaje7(int porcentaje7){
    return rCircleProgress.findByPorcentaje1(porcentaje7);
    }
    
        public Optional<CircleProgress> getByPorcentaje8(int porcentaje8){
    return rCircleProgress.findByPorcentaje1(porcentaje8);
    }
    
        public Optional<CircleProgress> getByPorcentaje9(int porcentaje9){
    return rCircleProgress.findByPorcentaje1(porcentaje9);
    }
    
        public Optional<CircleProgress> getByPorcentaje10(int porcentaje10){
    return rCircleProgress.findByPorcentaje1(porcentaje10);
    }
    
        public Optional<CircleProgress> getByPorcentaje11(int porcentaje11){
    return rCircleProgress.findByPorcentaje1(porcentaje11);
    }
    
    
    public void save(CircleProgress circleprogress){
        rCircleProgress.save(circleprogress);
    }
    
    public void delete(int id){
        rCircleProgress.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rCircleProgress.existsById(id);
    }
        
    public boolean existsByPorcentaje(int porcentaje){
        return rCircleProgress.existsByPorcentaje(porcentaje);
    }   
    
     public boolean existsByPorcentaje1(int porcentaje1){
        return rCircleProgress.existsByPorcentaje1(porcentaje1);
    }
    
       public boolean existsByPorcentaje2(int porcentaje2){
        return rCircleProgress.existsByPorcentaje2(porcentaje2);
    }
    
       public boolean existsByPorcentaje3(int porcentaje3){
        return rCircleProgress.existsByPorcentaje3(porcentaje3);
    }
    
       public boolean existsByPorcentaje4(int porcentaje4){
        return rCircleProgress.existsByPorcentaje4(porcentaje4);
    }
    
       public boolean existsByPorcentaje5(int porcentaje5){
        return rCircleProgress.existsByPorcentaje5(porcentaje5);
    }
    
       public boolean existsByPorcentaje6(int porcentaje6){
        return rCircleProgress.existsByPorcentaje6(porcentaje6);
    }
    
       public boolean existsByPorcentaje7(int porcentaje7){
        return rCircleProgress.existsByPorcentaje7(porcentaje7);
    }
    
       public boolean existsByPorcentaje8(int porcentaje8){
        return rCircleProgress.existsByPorcentaje8(porcentaje8);
    }
    
       public boolean existsByPorcentaje9(int porcentaje9){
        return rCircleProgress.existsByPorcentaje9(porcentaje9);
    }
    
       public boolean existsByPorcentaje10(int porcentaje10){
        return rCircleProgress.existsByPorcentaje10(porcentaje10);
    }
    
       public boolean existsByPorcentaje11(int porcentaje11){
        return rCircleProgress.existsByPorcentaje11(porcentaje11);
    }
    
     
     
}
   
