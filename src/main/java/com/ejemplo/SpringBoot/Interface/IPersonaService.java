package com.ejemplo.SpringBoot.Interface;

import com.ejemplo.SpringBoot.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
}
