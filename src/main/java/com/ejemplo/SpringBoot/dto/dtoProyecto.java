package com.ejemplo.SpringBoot.dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
     @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    
    //Constructor
    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }
    
    //Gettes y Setters
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    
}
