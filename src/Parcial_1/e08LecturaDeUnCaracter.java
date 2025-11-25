/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
Asignatura:                     NRC:29762
Fecha: 22/10/2025
Tema: Programa que me permite la lectura de un caracter

*/

import java.io.*;
public class e08LecturaDeUnCaracter {

    public static void main(String[] args) {
        //flujo de entrada
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //flujo de salida
        PrintStream ps = System.out;
        //declaramos vataible 
        String str1 = "Luka",str2,str3;
        int numero1 =0,numero2=0,cociente = 0,suma=0;
        
        //uso del try catch 
        try{
        //mostramos informacion en la pantalla
        ps.print("Ingrese un numero: ");
        str1 = br.readLine();
        //mostramos informacion en la pantalla
        ps.print("Ingrese un numero: ");
        str2 = br.readLine();
        
        numero1=Integer.parseInt(str1);
        numero2=Integer.parseInt(str2);
        
        suma= numero1+numero2;
        try {
            cociente= numero1/numero2;
        }catch(ArithmeticException ruben){
            System.out.println("INDETERMINACION"+ruben.getLocalizedMessage());
            cociente = 0;
        }
        

        }catch(IOException ex){
            System.err.println("ERROR 404 INTENTE NUEVAMENTE" + ex.toString());
        } catch(NumberFormatException ex){
            System.err.println("Error de fotmato"+ex.toString());
        }
        ps.println(" El numero ingresado es: " +numero1);
        ps.println("El numero ingresado es: "+numero2);
        ps.println("La suma es:" +suma ); 
        ps.println(" la division es: " +cociente);
        
        
    }
    
}
