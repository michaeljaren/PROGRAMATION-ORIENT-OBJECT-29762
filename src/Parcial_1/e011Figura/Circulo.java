/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa que me permite ver la figura del circulo
*/
package e011Figura;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Circulo extends e11Figura {
    private float radio;
    private float diametro;
    private float area;
    
    //constructor Vacio 
    public Circulo(){
    }
    
        public void ingresarDatosCirculo(){
        
        //clausula super  " superior" 
        super.ingresarDatos();
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio del ciruclo: ");
        radio = leer.nextFloat();  
        
    }
        //metodo para calcular el area
        public void calcularArea(){
            System.out.println(" ===CALCULAR AREA== ");
            area = (float) (Math.PI * Math.pow(radio, 2));
            System.out.println(" EL AREA DEL CIRUCLO ES: "+area);
 
        }
        
    //to String 
    @Override
    public String toString() {
        return "Circulo: " + "radio=" + radio + ", diametro=" + diametro + ", area=" + area ;
    }

    //get and set
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
        
    
    
}
