/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloc05;

/**
 *
 * @author Isma
 */

//FORMULA MOVIMIENTOS ALFIL --> Math.abs(f1 – f2) == Math.abs(c1 – c2)
public class Alfil extends Ficha{

    public Alfil(Casilla posicion, String color) {
        super(posicion, color);
    }
    
    @Override
    public boolean moverA(Casilla casilla) {
        if(Math.abs(this.getPosicion().getFila()-casilla.getFila()) == Math.abs(this.getPosicion().getColumna()-casilla.getColumna())){
           this.setPosicion(casilla);
           return true;
        }else{
           return false; 
        }
    }
    
    
    
    
}
