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
        //crea un obj de tipo programador
        Programador programador = new Programador ();
        programador.nombre="Carlos";
        programador.edad=25;

        
        
        //Crea un objeto
        Profesor profe= new Profesor(); 
        profe.nombre = "David"; 
        profe.escuela="UNAM";
        
        Futbolista fut = new Futbolista(); 
        fut.nombre = "Messi"; 
        fut.equipo = "Barcelona";
        
        /*
        System.out.print("\n"); 
        programador.imprimirSaludo(); 
        profe.imprimirSaludo(); 
        fut.imprimirSaludo();
        
       /* //POLIMORFISMOS ( MUCHAS FORMAS)
        System.out.println("\n"); 
        Persona per = new Futbolista(); //poliformismo variable con muchas formas 
        per.nombre = " CR7";
        per.imprimirSaludo(); 
        per = new Programador(); 
        per.nombre = " Messsi";
        per.imprimirSaludo();
*/
        
        //arreglo
        System.out.println("\n"); 
        Persona []arreglo = new Persona[3]; 
        arreglo [0]=new Programador(); 
        arreglo [1]=new Profesor(); 
        arreglo [2]=new Futbolista();
        //for normal
        
        for( int  i = 1;i<3 ; i++){
        arreglo[i].imprimirSaludo();
        }
        //puntero
        for (Persona puntero: arreglo){
            puntero.imprimirSaludo();
        }
    
        
    }
    

}

