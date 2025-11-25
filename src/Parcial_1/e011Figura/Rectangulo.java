/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa que me permite ver la figura del rectangulo
*/
package e011Figura;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Rectangulo extends e11Figura {
    //Atributos 
    private float base;
    private float altura; 
    private float area;
    //Metodos 
    
    //Constructor 
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
        
        
    }
    
    /*Metodo para ingresar datos
    @Override
    public void ingresarDatos(){
        //clausula super  " superior" 
        super.ingresarDatos();
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        base = leer.nextFloat();
        System.out.print("Ingrese la altura  del rectangulo: ");
        altura = leer.nextFloat();
        
    }
    */

    public void ingresarDatosRectangulo(){
        
        //clausula super  " superior" 
        super.ingresarDatos();
       

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        setBase(leer.nextFloat());
        System.out.print("Ingrese la altura  del rectangulo: ");
        setAltura(leer.nextFloat());
        
    }
    
         //metodo para calcular la area
    public void calcularArea(){
        System.out.println("=== RECTANGULO === ");
        area= ( base* altura);
        System.out.println("La area  es: " +area);
    }
    //to String 

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + '}';
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
    

    
   