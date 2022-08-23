
package com.ejemplo.SpringBoot.dto;

import javax.validation.constraints.NotBlank;


public class dtoSkillv1 {
     @NotBlank
    private int porcentaje;
    @NotBlank
    private String title;

    public dtoSkillv1() {
    }

    public dtoSkillv1(int porcentaje, String title) {
        this.porcentaje = porcentaje;
        this.title = title;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
}
