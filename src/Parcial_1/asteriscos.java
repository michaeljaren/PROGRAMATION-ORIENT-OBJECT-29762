
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LABS-ESPE
 */
public class asteriscos {
    

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nmumero: ");
        numero = sc.nextInt();
        generarFigura();
        

    }
    private static void generarFigura() {
        //trainfulo
        int numero =0;
        for( int i = 0; i < numero; i++){
            //Espacios
            for( int j = 0 ; j < numero-1;j++){
                System.out.println(" ");
            }
            //astetiscos
            for ( int k = 0 ; k<=i;k++){
                System.out.println("*");
            }
            System.out.println(" ");
            
    }
    }
    
   
    
}
