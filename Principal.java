/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 16/10/2025
  Tema: La clase Principal
*/ 
package e05Persona;

import java.util.Scanner;

public class Principal{
    public static void main(String [] args ){
        //nombre de la clase + nombre del objeto = new nombre del metodo (); 
        Persona objeto1 = new Persona("Michael", (byte)60,"masculino", "tu msj");
        
        Persona objeto2 = new Persona ("michael");
        
        Persona objeto3 = new Persona("Tu");
        
        System.out.println("nombre:" +objeto2.getEdad());
        System.out.println("nombre: "+objeto2.getNombre());
        System.out.println("nombre: "+objeto1.getMensaje());
        objeto1.imprimirSaludo();
        
        
        
        
        
    }
    

}

