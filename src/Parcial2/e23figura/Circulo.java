/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2.e23figura;

/**
 *
 * @author LABS-ESPE
 */
public class Circulo  {
    final double PI= 3.1416;
    double radio;
    public Circulo(){
        this.radio =0;
}
    public Circulo ( double radio){
        this.radio = radio;
    }
    
    public void calcularPerimetro(){
        double perimetro = 2*Math.PI*radio;
        System.out.println(" El perimetro del circulo es : " +perimetro);
    }
     public void calcularArea(){
        double area = Math.PI*Math.pow(radio, 2);
         System.out.println(" El area del circulo es : " +area);
    }
    
    
    
    
}
