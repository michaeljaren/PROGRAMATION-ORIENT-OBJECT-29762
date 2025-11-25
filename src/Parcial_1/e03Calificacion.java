
/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
Asignatura:                     NRC:29762
Fecha: 8/10/2025

Tema: Programa que me permite ver los tipos de datos
*/ 
//librerias

import java.util.Scanner;


public class e03Calificacion {
    //metodo principal para ver las calificaciones
    

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char calificacion;
        System.out.println("Ingrese la calificacion: ");
        calificacion = scanner.next().charAt(0);
        System.out.println("El caracter es : "+calificacion);
        switch(calificacion){
            case 'A': 
                System.out.println("Es aplicado ");
                break;
            case 'B': 
                System.out.println("Es excelente");
                break;
            case 'C': 
                System.out.println("Es regular");
                break;
            case 'D': 
                System.out.println("No es aplicado ");
                break;
            case 'E': 
                System.out.println(" Mal comportamiento");
                break;
                
            default: 
                System.out.println("No selecciono bien... ");
        }
        
    }
    
}
