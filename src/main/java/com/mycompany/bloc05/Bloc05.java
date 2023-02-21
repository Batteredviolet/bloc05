/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bloc05;

/**
 *
 * @author Isma
 */

public class Bloc05 {

    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        
        Casilla casilla = new Casilla(3,3);
        //Caballo caballo = new Caballo(casilla, "verde");
        //caballo.moverA(casilla);
        
        //INICIACION DEL JUEGO
        System.out.println("Bienvenido. ¿Qué color tendrá el alfil?");
        String colorAlfil = teclado.next();
        
        System.out.println("Genial, sigamos.\n¿Dónde quieres posicionarlo por primera vez?\nFila: ");
        int filaInicio1 = teclado.nextInt();
        System.out.println("Columna:");
        int columnaInicio1 = teclado.nextInt();
        
        //INSTANCIACION DEL OBJETO ALFIL
        Casilla casillaAlfil = new Casilla(filaInicio1,columnaInicio1);
        Alfil alfil = new Alfil(casillaAlfil, colorAlfil);
        
        System.out.println("Introduce la posición de la ficha Caballo.\nFila: ");
        int filaInicio2 = teclado.nextInt();
        System.out.println("Columna:");
        int columnaInicio2 = teclado.nextInt();
        
        //POSICION ALFIL
        int xA = alfil.getPosicion().getFila();
        int yA = alfil.getPosicion().getColumna();
        String colorAlf = alfil.getColor();
        
        //INSTANCIACION DEL OBJETO CABALLO
        Casilla casillaCaballo = new Casilla(filaInicio2, columnaInicio2);
        if(colorAlfil.equals("b")){
            Caballo caballo = new Caballo(casillaCaballo, "n");
            //POSICION CABALLO
            int xC = caballo.getPosicion().getFila();
            int yC = caballo.getPosicion().getColumna();
            String colorCab = caballo.getColor();
        }else{
            Caballo caballo = new Caballo(casillaCaballo, "b");
        }
        
        //METER EN EL ARRAY LAS FICHAS CON LA POSICION
        String[][] arrayPosiciones = new String[5][5];
        arrayPosiciones[xA][yA] = "A" + colorAlf;
        */
        String[][] arrayPosiciones = new String[5][5];
        Alfil alfil = posicionarAlfil();
        int xA = alfil.getPosicion().getFila();
        int yA = alfil.getPosicion().getColumna();
        arrayPosiciones[xA][yA] = "A"+alfil.getColor();
        
    }
    
    public static Alfil posicionarAlfil(){
        String colorAlfil = Utilidades.pedirString("Bienvenido, ¿qué color tendrá el Alfil?");
        int filaInicio = Utilidades.pedirEntero("Genial, sigamos.\n¿Dónde quieres posicionarlo por primera vez?\nFila: ");
        int columnaInicio = Utilidades.pedirEntero("Columna: ");
        
        Casilla casillaAlfil = new Casilla(filaInicio,columnaInicio);
        Alfil alfil = new Alfil(casillaAlfil, colorAlfil);
        return alfil; 
    }
    
    //Paso el alfil como parámetro para ayudarme a inicializar la propiedad "color" correctamente.
    public static Caballo posicionarCaballo(Alfil alfil){
        int filaInicio = Utilidades.pedirEntero("Introduce la posición de la ficha Caballo.\nFila: ");
        int columnaInicio = Utilidades.pedirEntero("Columna: ");
        
        Casilla casillaCaballo = new Casilla(filaInicio,columnaInicio);
        
        if(alfil.getColor().equals("b")){
            Caballo caballo = new Caballo(casillaCaballo, "n");
            return caballo;
        }else{
            Caballo caballo = new Caballo(casillaCaballo, "b");
            return caballo;
        }
    }
    
}
