
package com.ejemplo.SpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CircleProgress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int porcentaje;
    private int porcentaje1;
    private int porcentaje2;
    private int porcentaje3;
    private int porcentaje4;
    private int porcentaje5;
    private int porcentaje6;
    private int porcentaje7;
    private int porcentaje8;
    private int porcentaje9;
    private int porcentaje10;
    private int porcentaje11;

    public CircleProgress() {
    }

    public CircleProgress(int porcentaje, int porcentaje1, int porcentaje2, int porcentaje3, int porcentaje4, int porcentaje5, int porcentaje6, int porcentaje7, int porcentaje8, int porcentaje9, int porcentaje10, int porcentaje11) {
        this.porcentaje = porcentaje;
        this.porcentaje1 = porcentaje1;
        this.porcentaje2 = porcentaje2;
        this.porcentaje3 = porcentaje3;
        this.porcentaje4 = porcentaje4;
        this.porcentaje5 = porcentaje5;
        this.porcentaje6 = porcentaje6;
        this.porcentaje7 = porcentaje7;
        this.porcentaje8 = porcentaje8;
        this.porcentaje9 = porcentaje9;
        this.porcentaje10 = porcentaje10;
        this.porcentaje11 = porcentaje11;
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

    public int getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(int porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public int getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(int porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public int getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(int porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public int getPorcentaje4() {
        return porcentaje4;
    }

    public void setPorcentaje4(int porcentaje4) {
        this.porcentaje4 = porcentaje4;
    }

    public int getPorcentaje5() {
        return porcentaje5;
    }

    public void setPorcentaje5(int porcentaje5) {
        this.porcentaje5 = porcentaje5;
    }

    public int getPorcentaje6() {
        return porcentaje6;
    }

    public void setPorcentaje6(int porcentaje6) {
        this.porcentaje6 = porcentaje6;
    }

    public int getPorcentaje7() {
        return porcentaje7;
    }

    public void setPorcentaje7(int porcentaje7) {
        this.porcentaje7 = porcentaje7;
    }

    public int getPorcentaje8() {
        return porcentaje8;
    }

    public void setPorcentaje8(int porcentaje8) {
        this.porcentaje8 = porcentaje8;
    }

    public int getPorcentaje9() {
        return porcentaje9;
    }

    public void setPorcentaje9(int porcentaje9) {
        this.porcentaje9 = porcentaje9;
    }

    public int getPorcentaje10() {
        return porcentaje10;
    }

    public void setPorcentaje10(int porcentaje10) {
        this.porcentaje10 = porcentaje10;
    }

    public int getPorcentaje11() {
        return porcentaje11;
    }

    public void setPorcentaje11(int porcentaje11) {
        this.porcentaje11 = porcentaje11;
    }

    
}
