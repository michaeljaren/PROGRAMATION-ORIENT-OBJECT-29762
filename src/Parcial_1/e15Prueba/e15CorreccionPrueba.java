/*  
    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
                    SOFTWARE 
    NOMBRE: MICHAEL BARRAGAN        
    PERIODO: PREGRADO SII OCTUBRE 25 - MARZO
    Asignatura: POO                    
    NRC: 29762
    Fecha: 29/10/2025

    Tema: Corrección de la prueba del 28/10/2025.
    Programa que permite generar un menú.
*/

package e15Prueba;

import java.util.Scanner;

public class e15CorreccionPrueba {

    // Creamos un solo objeto Scanner que puede usarse en todos los métodos
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char opcion;

        do {
            System.out.println("== MENU ==");
            System.out.println("1. Figura");
            System.out.println("2. Serie");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.next().charAt(0);

            switch (opcion) {
                case '1':
                    generarFigura();
                    break;

                case '2':
                    //generarSerie();
                    break;

                case '3':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != '3'); 

        leer.close(); 
    }

    // Método para generar una figura (ejemplo: triángulo)
    private static void generarFigura() {
        System.out.print("Ingrese un número para la altura de la figura: ");
        int numero;
        numero= leer.nextInt();
        
        //validar 
        while(numero <0){
            System.out.println("Ingrese un numero postiivo");
            numero = leer.nextInt();
        }
        // Triángulo superior
        for (int i = 0; i < numero; i++) {
            // Espacios antes de los asteriscos
            for (int j = i; j < numero - 1; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // Salto de línea al final de cada fila
            System.out.println();        
}

        
        
        

}
    private static void generarSerie(Scanner scanner) {
        System.out.println("SERIE");
        System.out.println("Ingrese limite : ");
        int numero = scanner.nextInt();
        
        //validar
        //validarNumero(numero);
        
        
        
   
    }

    private static void validarNumero(int numero, Scanner scanner) {
        System.out.println(" ");
       
    }
    
    
}

