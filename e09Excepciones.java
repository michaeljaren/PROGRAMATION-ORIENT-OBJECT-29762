/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa que me permite ver las excepciones
*/

import java.io.*;

public class e09Excepciones {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = System.out;

        String entrada1 = "";
        String entrada2 = "";
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        int cociente = 0;

        try {
            // Lectura de datos
            ps.print("Ingrese un numero: ");
            entrada1 = br.readLine();

            ps.print("Ingrese otro numero: ");
            entrada2 = br.readLine();

            // Conversión a enteros
            numero1 = Integer.parseInt(entrada1);
            numero2 = Integer.parseInt(entrada2);

            // Verificación de rango
            rangoDatos(numero1, 20); // por ejemplo: número entre -5 y 20

            // Suma
            suma = numero1 + numero2;

            // División segura
            try {
                cociente = numero1 / numero2;
            } catch (ArithmeticException e) {
                System.out.println("INDETERMINACION: " + e.getMessage());
                cociente = 0;
            }

        } catch (IOException e) {
            System.err.println("ERROR DE ENTRADA/SALIDA: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("ERROR DE FORMATO NUMERICO: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR DE RANGO: " + e.getMessage());
        }

        // Resultados
        ps.println("Primer numero ingresado: " + numero1);
        ps.println("Segundo numero ingresado: " + numero2);
        ps.println("Suma: " + suma);
        ps.println("Division: " + cociente);
    }

    // Método que verifica si un número está dentro de un rango (-5 a max)
    private static void rangoDatos(int numero, int i) {
        System.out.println("Verificando rango...");
        if (numero > 100 || i < -5) {
            throw new IllegalArgumentException("El numero debe estar entre -5 y 100 " );
        }
    }
}
