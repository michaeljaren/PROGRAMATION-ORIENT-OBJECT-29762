/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 15/10/2025
  Tema: La clase Persona
*/ 
//librerias 
package e05Persona;
import java.util.Scanner;

public class Persona {
    //Atributros Variables globales
    //toUpperCase para MAYUSCULAS y toLowerCase para minusculas
    String nombre; 
    byte edad;
    String sexo;
    String mensaje;
    

    //Metodos:
     //Metodo llamado constructor vacio o por defecto
     //metodo1
    public Persona(){
    
    }
    
    public void imprimirSaludo(){
        System.out.println("Hola, soy una persona me llamo: "+nombre);
    }
    
    //get and set  
    //los get and set sirven para encapsular los atributos


   
    

}



 //Metodo que no tiene argumentos
    /*
    public static void main(String[] args ){
        //Atributos-Variables locales
        int numero1,numero2,numero3,suma=0,resta,multiplicacion,division,promedio;
        //Ingreso de datos
        System.out.print(" Ingrese un numero: ");
        numero1=leer.nextInt();
        System.out.print(" Ingrese un numero: ");
        numero2=leer.nextInt();
        //Proceso
        numero3= sumarNumeros ( numero1, numero2, suma); //argumento yo envio valores
        System.out.println("La suma es: "+numero3);
        //Mostrar Datos
        imprimirSaludo();

    }
    public static int  sumarNumeros(int numero11,int numero12,int sumas){ //parametro yo creo los valores
        sumas = numero11 +numero12;
        System.out.println(" La suma es: " +sumas);
        return sumas;
    }
*/