/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloc05;
import java.util.Scanner;
/**
 *
 * @author Isma
 */
public class Utilidades {
    public static int pedirEntero(String prompt){
        Scanner teclado = new Scanner(System.in);
        int entero = 0;
        
        System.out.print(prompt);
        entero = teclado.nextInt();
        return entero;
    }
    
    public static String pedirString(String prompt){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        System.out.println(prompt);
        cadena = teclado.nextLine();
        return cadena;
    }
    
}
