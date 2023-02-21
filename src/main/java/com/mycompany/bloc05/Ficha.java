/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloc05;

/**
 *
 * @author Isma
 */
public abstract class Ficha {
    private Casilla posicion;
    private String color;
    
    //Llamar al constructor de la clase Casilla
    public Ficha(Casilla posicion, String color) {
        this.posicion = new Casilla(posicion.getFila(),posicion.getColumna());
        this.color = color;
    }
    
    public Casilla getPosicion() {
        return posicion;
    }

    public void setPosicion(Casilla posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract boolean moverA(Casilla casilla);
}
