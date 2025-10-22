/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa que me permite ver las excepciones
*/

import java.io.*;

public class e10CrearExcepciones {

    public static void main(String[] args) throws E10MiException {
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

            // Verificación de rango: entre -5 e i (por ejemplo, i = 100)
            rangoDatos(numero1, 100);

            // Suma
            suma = numero1 + numero2;

            // División segura
            try {
                cociente = numero1 / numero2;
            } catch (ArithmeticException e) {
                System.err.println("INDETERMINACION: " + e.getMessage());
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
        ps.println("\nSegundo numero ingresado: " + numero2);
        
        ps.println("Suma: " + suma);
        ps.println("Division: " + cociente);
    }

    // Verifica que el número esté en el rango [-5, i]
    private static void rangoDatos(int numero1, int i) throws E10MiException {
        System.out.println("Verificando rango...");
        if (numero1 < -5 || numero1 > i) {
            throw new E10MiException();
        }
    }
}
