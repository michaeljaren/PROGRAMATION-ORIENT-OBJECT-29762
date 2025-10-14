/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
Asignatura:                     NRC:29762
Fecha: 8/10/2025
Tema: Prueba 1 del cuadro de caracteres en java
*/ 

//importamos la libreria scanner
import java.util.Scanner;

public class e04Prueba1 {
    public static void main(String [] args ){
  //Creamos el objeto Scanner para leer datos(Instanciar = crear e inicializar)
    Scanner leer = new Scanner (System.in);  
    //Declaramos variables
    int numero=0;
    char caracter;
        //Ingresamos Datos
        System.out.print("Ingrese un numero: " );
        numero=leer.nextInt();
        System.out.print("Ingrese un caracter: " );
        caracter=leer.next().charAt(0);
        //proceso
        for(int i = 0; i<numero;i++){
            for(int j=0; j<numero;j++){
                System.out.print(caracter);
            }
            System.out.print(" \n");
        
        }
        //Mostramos datos
        System.out.println("El caracter es: " +caracter);
        System.out.println("El numero es: "+numero);
        
        
        
        
        
    
    
    
    
    }
    
    
    
    
}
