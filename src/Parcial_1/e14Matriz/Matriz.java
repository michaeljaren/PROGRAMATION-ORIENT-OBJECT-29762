package e14Matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        // Inicializamos un contador para asignar valores a la matriz
        int k = 1; 
        

        // Crear una matriz de enteros de 3 filas y 2 columnas
        // Sintaxis: tipoDeDato[][] nombreMatriz = new tipoDeDato[filas][columnas];
        int[][] matriz = new int[3][2];

        // Llenar la matriz con valores
        // Bucle externo recorre las filas
        for (int i = 0; i < 3; i++) {
            // Bucle interno recorre las columnas
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = k; // Asignar el valor de k a la posición [i][j]
                k += 1;           // Incrementar k para el siguiente valor
            }
        }
         for (int i = 0; i < 3; i++) {
            // Bucle interno recorre las columnas
            for (int j = 0; j < 2; j++) {
                Scanner sc = new Scanner (System.in);
                System.out.println("Ingrese un numoer [][]: ");
                matriz[i] [j] = sc.nextInt();
            }
        }

        // Imprimir la matriz
        // Bucle externo recorre filas
        for (int i = 0; i < 3; i++) {
            // Bucle interno recorre columnas
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t"); // Imprime el valor con tabulación
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
