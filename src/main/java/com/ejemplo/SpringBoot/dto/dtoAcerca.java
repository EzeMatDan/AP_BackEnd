package com.ejemplo.SpringBoot.dto;

import javax.validation.constraints.NotBlank;


public class dtoAcerca {
    @NotBlank
    private String nombreA;
    @NotBlank
    private String descripcionA;

    //Constructor
    public dtoAcerca() {
    }

    public dtoAcerca(String nombreA, String descripcionA) {
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
    }
    
    //Getters y Setters
    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }
    
    
}
