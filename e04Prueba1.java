/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 8/10/2025
  Tema: Prueba 1 - Cuadro de caracteres alternado
*/ 

import java.util.Scanner;

public class e04Prueba1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        char caracter;

        System.out.print("Ingrese un numero:  ");
        numero = leer.nextInt();
        System.out.print("Ingrese un caracter:  ");
        caracter = leer.next().charAt(0);

        // Proceso para formar el patrón
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) { // líneas llenas
        for (int j = 0; j < numero; j++) {
            System.out.print(caracter);
            }
        } else { // líneas huecas
        for (int j = 0; j < numero; j++) {
            if (j == 0 || j == numero - 1) {
                System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
        }
    }
        System.out.println();
    }
        //Mostramos datos
        System.out.println("El caracter es: " +caracter);
        System.out.println("El numero es: "+numero);
        
    }
}

        
       
