
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.dto.dtoSkillv1;
import com.ejemplo.SpringBoot.entity.Skillv1;
import com.ejemplo.SpringBoot.security.controller.Mensaje;
import com.ejemplo.SpringBoot.service.SSkillv1;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skillv1")
public class CSkillv1 {
    @Autowired
    SSkillv1 sSkillv1;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skillv1>> list(){
        List<Skillv1> list = sSkillv1.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skillv1> getById(@PathVariable("id")int id) {
        if(!sSkillv1.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"),HttpStatus.BAD_REQUEST);
        }
        
        Skillv1 skillv1 = sSkillv1.getOne(id).get();
        return new ResponseEntity(skillv1, HttpStatus.OK);
    }

    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!sSkillv1.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sSkillv1.delete(id);
        return new ResponseEntity(new Mensaje("Skill... eliminado"),HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkillv1 dtoskillv1){
        if (StringUtils.isBlank(dtoskillv1.getTitle())){
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"),HttpStatus.BAD_REQUEST);
        }
        if(sSkillv1.existsByTitle(dtoskillv1.getTitle())){
            return new ResponseEntity(new Mensaje("Ese titulo ya existe"),HttpStatus.BAD_REQUEST);
        }
        
        Skillv1 skillv1 = new Skillv1 (
        dtoskillv1.getPorcentaje(), dtoskillv1.getTitle()
        );
          sSkillv1.save(skillv1);
          return new ResponseEntity(new Mensaje("Titulo creado"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody dtoSkillv1 dtoskillv1){
        if(!sSkillv1.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sSkillv1.existsByPorcentaje(dtoskillv1.getPorcentaje())&& sSkillv1.getByTitle(dtoskillv1.getTitle()).get().getId()!=id){
            return new ResponseEntity(new Mensaje("Ese titulo ya existe"),HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoskillv1.getTitle())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"),HttpStatus.BAD_REQUEST);
        }
        
        
        Skillv1 skillv1 = sSkillv1.getOne(id).get();
        
        skillv1.setTitle(dtoskillv1.getTitle());
        skillv1.setPorcentaje(dtoskillv1.getPorcentaje());
        
        sSkillv1.save(skillv1);
        return new ResponseEntity(new Mensaje("Skill actualizado"), HttpStatus.OK);
    }
}
