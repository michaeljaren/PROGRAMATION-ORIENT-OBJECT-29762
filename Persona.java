/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 8/10/2025
  Tema: La clase Persona
*/ 
//librerias 
package e05Persona;
import java.util.Scanner;

public class Persona {
    //Atributros Variables globales
    static String nombre = "MICHAEL".toLowerCase();
    //toUpperCase para MAYUSCULAS y toLowerCase para minisculas
    
    byte edad;
    String sexo;
    static Scanner leer = new Scanner(System.in);

    //Metodos:
    //Metodo que no tiene argumentos
    public static  void imprimirSaludo(){
        System.out.println(" Hola , me llamo "+nombre);
    }
    public static void main(String[] args ){
        //Atributos-Variables locales
        int numero1,numero2,numero3,suma=0,resta,multiplicacion,division,promedio;
        //Ingreso de datos
        System.out.print(" Ingrese un numero: ");
        numero1=leer.nextInt();
        System.out.print(" Ingrese un numero: ");
        numero2=leer.nextInt();
        //Proceso
        sumarNumeros( numero1, numero2, suma);
        
        //Mostrar Datos
        imprimirSaludo();

    }
    public static void sumarNumeros(int numero1,int numero2,int suma){
        suma = numero1 +numero2;
        System.out.println(" La suma es: " +suma);
    
    }
    
}
