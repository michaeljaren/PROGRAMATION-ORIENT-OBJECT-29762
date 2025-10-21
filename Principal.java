/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e06Vehiculo;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Principal {
    public static void main(String[] args) {
        // Objeto1 
        Vehiculo vehiculo = new Vehiculo();
        //creamos el objeto Scanner para leer datos
        Scanner scanner = new Scanner (System.in);
        System.out.println(" ");
        System.out.println(vehiculo.mostrarDatos());
        vehiculo.ingresarDato();
        System.out.println(" ");
        System.out.println(vehiculo.mostrarDatos());
        System.out.println(" ");
        System.out.println("\nCambie la marca: ");
        
        //leer dato
        vehiculo.setMarca(scanner.nextLine());
        System.out.println(vehiculo.mostrarDatos());
        System.out.println(vehiculo.toString());
    }
    
    
}
