
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.entity.Skillv1;
import com.ejemplo.SpringBoot.repository.RSkillv1;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkillv1 {
    
    @Autowired
    RSkillv1 rSkillv1;
    
    public List<Skillv1> list() {
        return rSkillv1.findAll();
    }
    
    public Optional<Skillv1> getOne(int id){
        return rSkillv1.findById(id);
    }
    
    public Optional<Skillv1> getByTitle(String title){
        return rSkillv1.findByTitle(title);
    }
    
      public Optional<Skillv1> getByPorcentaje(int porcentaje){
        return rSkillv1.findByPorcentaje(porcentaje);
    }
    
    public void save(Skillv1 skillv1){
        rSkillv1.save(skillv1);
    }
    
    public void delete(int id){
        rSkillv1.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rSkillv1.existsById(id);
    }
        
    public boolean existsByTitle(String title){
        return rSkillv1.existsByTitle(title);
    }    
    
        public boolean existsByPorcentaje(int porcentaje){
        return rSkillv1.existsByPorcentaje(porcentaje);
    }    
}
