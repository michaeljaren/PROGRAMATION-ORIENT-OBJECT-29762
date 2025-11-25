/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa que me permite ver la figura del triangulo
*/
package e011Figura;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Triangulo extends e11Figura {
    //atributos
    private float base;
    private float altura;
    private float area;
    
    //metodo para ingresar datos
    public void ingresarDatosTriangulo(){
        
        //clausula super  " superior" 
        super.ingresarDatos();
       

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del triangulo: ");
        base = leer.nextFloat();
       
        System.out.print("Ingrese la altura  del triangulo: ");
        altura = leer.nextFloat();
  
    }
    
    //metodo para calcular la area
    public void calcularArea(){
        System.out.println("=== TRIANGULO === ");
        area= ( base* altura)  / 2;
        System.out.println("La altura es: " +area);
        
    }
    
    //mostrar la info

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + '}';
    }
    
    //get and set

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    
    
    
}
