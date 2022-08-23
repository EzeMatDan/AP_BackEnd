
package com.ejemplo.SpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skillv1 {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int id;
    private int porcentaje;
    private String title;

    public Skillv1() {
    }

    public Skillv1(int porcentaje, String title) {
        this.porcentaje = porcentaje;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
