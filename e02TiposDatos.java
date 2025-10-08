/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
Asignatura:                     NRC:29762
Fecha: 8/10/2025

Tema: Programa que me permite ver los tipos de datos
*/
public class e02TiposDatos {
    public static void main (String[] variable){
        byte edad= 127; // el tipo de dato byte esta dentro del rango -128 -0- 127
        short pequenio=32767; //el tipó de dato short esta dentro del rango -32768 a 32767 
        int entero=330000000; //el tipo de dato int esta dentro del rango 2*10^9 
        float decimal= (float)15.15; //toca hacer un casting para ver el float
        double decimalGrande = 15.15; // no hay que hacer casting 
        char caracter= '*';
        boolean boleano= false;
        String cadena = "Michael Jaren";
        System.out.println("El cajon byte contiene: "+edad);
        System.out.println("El cajon short contiene: "+pequenio);
        System.out.println("El cajon int contiene: "+entero);
        System.out.println("El cajon float contiene: " + decimal);
        System.out.println("El cajon de doublle contiene: "+decimalGrande);
        System.out.println("El cajon de char contiene un caracter:" +caracter);
        System.out.println("El cajon del boleano contiene: "+boleano);
        System.out.println("El cajon String contiene una cadena de caracteres:" +cadena);
    }
    
}
