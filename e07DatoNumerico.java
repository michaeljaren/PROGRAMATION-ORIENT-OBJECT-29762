/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
Asignatura:                     NRC:29762
Fecha: 21/10/2025
Tema: Programa que me permite ingresar un dato numerico y mostrar dicho dato

/*import java.io.BufferedReader; import java.io.InputStreamReader; */ 

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e07DatoNumerico {
    //Metodo
    public static void main (String [] args ){
    //Atributos
    int numero = 0; 
    //creamos el objeto Scanner para leer datos
    //Scanner leer = new Scanner(System.in);
    /*Otra forma de leer datos (Flujo de datos de entrada)
        declaracion de flujos de entrada  
    
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    */
    
    //otra forma
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //declara flujo de salida de datos 
   PrintStream fs = System.out;

 
    
    
    

    
    //inicializa
        //ingreso datos
        
        fs.println("Ingrese un numero: ");
        try {
            numero = br.read();
        } catch (IOException ex) {
            System.out.println("Error"+ex.toString());
           
        }
        
        //mostramos dato
        System.err.println("Tu numero es: "+numero);
        
    }
   
   
    
    
    
}
