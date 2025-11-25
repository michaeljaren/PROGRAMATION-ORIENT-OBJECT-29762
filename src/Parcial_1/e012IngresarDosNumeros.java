/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 8/10/2025
  Tema: Programa que me permita ingresar y mostrar los dos numeros y la suma
*/ 
//importo loibreria

import java.util.Scanner;
public class e012IngresarDosNumeros {
    public static void main (String [] args ){
        //creo el objeto escaner para leer
        Scanner leer = new Scanner(System.in);
        //atributos
        int numero1 = 0;
        int numero2= 0;
        int suma = 0;
        
        //Ingreso de datos 
        System.out.print("INGRESE UN  NUMERO: ".toLowerCase());
        numero1= leer.nextInt();
        System.out.print("INGRESE OTRO NUMERO: ".toLowerCase());
        numero2 = leer.nextInt();
        //Proceso de suma de numeros
        suma= numero1+numero2;
        //Muestro la pantalla
        System.out.println("Su numero 1 es : "+numero1);
        System.out.println("Su numero 2 es : "+numero2);
        System.out.println("La suma total es : "+suma);
   
    }
  
}
