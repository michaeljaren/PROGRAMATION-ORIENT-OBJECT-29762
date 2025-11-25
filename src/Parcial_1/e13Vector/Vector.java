package e13Vector;

import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        // Create an array of Strings
        String[] vector = new String[3];

        // Initialize the array
        for (int i = 0; i < vector.length; i++) {
            vector[i] = "luka";
        }
        //Ingresar nombre
        for (int i = 0; i< vector.length; i++){
            Scanner leer = new Scanner (System.in);
            System.out.println("Ingtrese el nombre".toUpperCase());
            vector [i] = leer.nextLine();
            
            
            
        }
        // Print the array elements
        for (int i = 0; i < vector.length; i++) {
            System.out.println((i + 1) + " " + vector[i]);
        }
    }
}
