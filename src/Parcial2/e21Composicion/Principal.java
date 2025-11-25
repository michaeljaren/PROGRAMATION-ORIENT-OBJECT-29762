
package Parcial2.e21Composicion;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        //Dec. Variables Locales 
        //Instanciamos 
        Almacen almacen= new Almacen(); 
        System.out.println("Almacen:" +almacen.nombre +"Cuenta No. "
                +almacen.cuenta.numero);
        Scanner leer = new Scanner(System.in);
        int numero=0;
        int variable = 1;
        System.out.println("Ingrese el numero");
        numero = leer.nextInt();
        
        
        if(variable ==1 || variable == numero){
            for(int i =0 ; i<numero;i++){
                for(int j=0;j<numero;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }  

        }else{
            for(int i=1; i<numero;i++){
                for(int j=0;j<numero-2;j++)
                System.out.println(" ");
            }
        }
        
    }
            
    
}
