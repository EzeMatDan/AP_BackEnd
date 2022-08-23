
package com.ejemplo.SpringBoot.Controller;


import com.ejemplo.SpringBoot.dto.dtoCircleProgress;
import com.ejemplo.SpringBoot.entity.CircleProgress;
import com.ejemplo.SpringBoot.security.controller.Mensaje;
import com.ejemplo.SpringBoot.service.SCircleProgress;
import java.util.List;
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
@RequestMapping("/porcentaje")

public class CCircleProgress {
    
    @Autowired
    SCircleProgress sCircleProgress;
    
    @GetMapping("/lista")
    public ResponseEntity<List<CircleProgress>> list(){
        List<CircleProgress> list = sCircleProgress.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<CircleProgress> getById(@PathVariable("id")int id) {
        if(!sCircleProgress.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"),HttpStatus.BAD_REQUEST);
        }
        
        CircleProgress circleprogress = sCircleProgress.getOne(id).get();
        return new ResponseEntity(circleprogress, HttpStatus.OK);
    }

    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!sCircleProgress.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sCircleProgress.delete(id);
        return new ResponseEntity(new Mensaje("Porcentaje eliminado"),HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoCircleProgress dtocircleprogress){
        if(sCircleProgress.existsByPorcentaje(dtocircleprogress.getPorcentaje())){
            return new ResponseEntity(new Mensaje(" ya existe"),HttpStatus.BAD_REQUEST);
        }
        
        CircleProgress circleprogress = new CircleProgress (
        dtocircleprogress.getPorcentaje(),
        dtocircleprogress.getPorcentaje1(),
        dtocircleprogress.getPorcentaje2(),
        dtocircleprogress.getPorcentaje3(),
        dtocircleprogress.getPorcentaje4(),
        dtocircleprogress.getPorcentaje5(),
        dtocircleprogress.getPorcentaje6(),
        dtocircleprogress.getPorcentaje7(),
        dtocircleprogress.getPorcentaje8(),
        dtocircleprogress.getPorcentaje9(),
        dtocircleprogress.getPorcentaje10(),
        dtocircleprogress.getPorcentaje11());
          sCircleProgress.save(circleprogress);
          return new ResponseEntity(new Mensaje("creado"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody dtoCircleProgress dtocircleprogress){
        if(!sCircleProgress.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sCircleProgress.existsByPorcentaje(dtocircleprogress.getPorcentaje())&& sCircleProgress.getByPorcentaje(dtocircleprogress.getPorcentaje()).get().getId()!=id){
            return new ResponseEntity(new Mensaje(" ya existe"),HttpStatus.BAD_REQUEST);
        }
        
        CircleProgress circleprogress = sCircleProgress.getOne(id).get();
        circleprogress.setPorcentaje(dtocircleprogress.getPorcentaje());
        circleprogress.setPorcentaje1(dtocircleprogress.getPorcentaje1());
        circleprogress.setPorcentaje2(dtocircleprogress.getPorcentaje2());
        circleprogress.setPorcentaje3(dtocircleprogress.getPorcentaje3());
        circleprogress.setPorcentaje4(dtocircleprogress.getPorcentaje4());
        circleprogress.setPorcentaje5(dtocircleprogress.getPorcentaje5());
        circleprogress.setPorcentaje6(dtocircleprogress.getPorcentaje6());
        circleprogress.setPorcentaje7(dtocircleprogress.getPorcentaje7());
        circleprogress.setPorcentaje8(dtocircleprogress.getPorcentaje8());
        circleprogress.setPorcentaje9(dtocircleprogress.getPorcentaje9());
        circleprogress.setPorcentaje10(dtocircleprogress.getPorcentaje10());
        circleprogress.setPorcentaje11(dtocircleprogress.getPorcentaje11());
        sCircleProgress.save(circleprogress);
        return new ResponseEntity(new Mensaje("actualizado"), HttpStatus.OK);
    }
}
    

