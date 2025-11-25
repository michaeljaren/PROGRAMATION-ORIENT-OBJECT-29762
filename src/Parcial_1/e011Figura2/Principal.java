/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa principal
*/
package e011Figura;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // ===== FIGURA BASE =====
        e11Figura figura = new e11Figura();
        System.out.println(figura.toString());
        figura.setNombre("Luka Modric");
        System.out.println(figura.toString());
        System.out.println("\n");
        
        // ===== POLIMORFISMO =====
        e11Figura[] vector = new e11Figura[3];
        vector[0] = new Circulo();
        vector[1] = new Rectangulo();
        vector[2] = new Triangulo();

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i].toString());
        }
        
        // ===== MENÚ PRINCIPAL =====
        char opcion;
        
        do {
            System.out.println("\n ==== MENU ====");
            System.out.println("A. INGRESAR CIRCULO");
            System.out.println("B. INGRESAR RECTANGULO");
            System.out.println("C. INGRESAR TRIANGULO");
            System.out.println("D. SALIR");
            System.out.print("Seleccione una opcion: ");
            
            opcion = sc.next().toUpperCase().charAt(0);
            
            switch (opcion) {
                case 'A':
                    System.out.println("USTED HA SELECCIONADO UN CIRCULO");
                    Circulo circulo = new Circulo();
                    System.out.println(circulo.toString());
                    circulo.ingresarDatosCirculo();
                    circulo.calcularArea();
                    System.out.println(circulo.toString());
                    break;
                    
                case 'B':
                    System.out.println("USTED HA SELECCIONADO UN RECTANGULO");
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println(rectangulo.toString());
                    rectangulo.ingresarDatosRectangulo();
                    rectangulo.calcularArea();
                    System.out.println(rectangulo.toString());
                    break;
                    
                case 'C':
                    System.out.println("USTED HA SELECCIONADO UN TRIANGULO");
                    Triangulo triangulo = new Triangulo();
                    System.out.println(triangulo.toString());
                    triangulo.ingresarDatosTriangulo();
                    triangulo.calcularArea();
                    System.out.println(triangulo.toString());
                    break;
                    
                case 'D':
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;
                    
                default:
                    System.out.println("ERROR: OPCION INVALIDA. INTENTE NUEVAMENTE.");
                    break;
            }
            
        } while (opcion != 'D');
        
        sc.close();
    }
}
