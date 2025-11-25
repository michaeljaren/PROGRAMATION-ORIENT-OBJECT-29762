
package Conjunta1P1;

import java.util.Scanner;

public class tabla {
    //Atributos
    int numero;
    Scanner leer = new Scanner(System.in); 
    public void ingresarTabla(){
        System.out.print("Ingrese un numero: ");
        numero = leer.nextInt();
        System.out.println(" === TABLA DE MULTIPLICAR === ");
        for(int i =1; i<=12;i++){
            System.out.println("Tabla del " +i);
            for(int j =1 ; j<=numero ;j++){
                System.out.println(i +"x" +j +" = " + i*j );
            }
            System.out.println();  
        }   
    }  
}
