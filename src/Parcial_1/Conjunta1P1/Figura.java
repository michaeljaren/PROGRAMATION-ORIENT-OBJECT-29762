/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
CARRERA SOFTWARE 
NOMBRE: MICHAEL JAREN           PERIODO: PREGADO SII OCTUBRE25 - MARZO26
ASIGNATURA: POO                 NRC: 29762
TEMA: Clase Figura


*/
package Conjunta1P1;

import java.util.Scanner;


public class Figura {
    
    //atributos
    int numero; 
    char figura; 
    //ceramos el objeto scanner
    Scanner leer = new Scanner (System.in);
    
    //Metodos
    public void ingresarFigura(){
        System.out.println("=== TRIANGULO DE CARACTERES === ");
        System.out.print("Ingrese un numero: ");
        numero= leer.nextInt();
        System.out.print("Ingrese el caracter: ");
        figura= leer.next().charAt(0);
        for (int i = 0; i<numero;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(figura + " ");
            }
            System.out.println();
        }
        
        
    }
    
    
    
}
