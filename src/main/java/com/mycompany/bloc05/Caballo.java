/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloc05;

/**
 *
 * @author Isma
 */

//FÓRMULA MOVIMIENTOS CABALLO --> (f1-f2)*(f1-f2) +(c1-c2)*(c1-c2) == 5
public class Caballo extends Ficha{

    public Caballo(Casilla posicion, String color) {
        super(posicion, color);
    }
    
    @Override
    public boolean moverA(Casilla casilla) {
        if((this.getPosicion().getFila() - casilla.getFila()) * (this.getPosicion().getFila() - casilla.getFila()) + (this.getPosicion().getColumna() - casilla.getColumna()) * (this.getPosicion().getColumna() - casilla.getColumna() ) == 5){
            this.setPosicion(casilla);
            return true;
        }else{
            return false;
        }
    }
    
    
}
