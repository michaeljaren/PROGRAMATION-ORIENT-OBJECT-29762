package Parcial2.ClaseAbstracta;

import java.util.Scanner;

public class Principal  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radio, lado;

        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();

        // x y y pueden ser cualquier número, no afectan al área
        Circulo circulo = new Circulo(radio, 0, 0);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado, 0, 0);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
