/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
CARRERA SOFTWARE 
NOMBRE: MICHAEL JAREN           PERIODO: PREGADO SII OCTUBRE25 - MARZO26
ASIGNATURA: POO                 NRC: 29762
TEMA: UN MENU CON FIGURAS, TABLA 


*/
package practica;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args ) {
        // ATRIBUTOS
        char opcion;
        //creamos los objetos 
        Figura figura = new Figura();
        Scanner leer = new Scanner (System.in);
        tabla tabla = new tabla();

        

        // el menu
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Generar Tabla");
            System.out.println("2. Generar Figura");
            System.out.println("3.Salir");
            System.out.println("Eliga una opcion");
            opcion = leer.next().charAt(0);
            switch(opcion){
                case '1':
                    tabla.ingresarTabla();
                    break; 
                case '2':
                    figura.ingresarFigura();
                    break;
                case '3':
                    System.out.println(" GRACIAS POR USAR EL PROGRAMA :) ");
                    break;
                default:
                    System.err.println("Ingrese una opcion valida !");
                    break;
                    
        }
            
            
        }while(opcion !='3');
            
    }
    

    
}
