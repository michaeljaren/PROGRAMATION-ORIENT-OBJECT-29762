/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
CARRERA SOFTWARE 
NOMBRE: MICHAEL JAREN           PERIODO: PREGADO SII OCTUBRE25 - MARZO26
ASIGNATURA: POO                 NRC: 29762
TEMA: CLASE HIJA CIRCULO EL CUAL HEREDA DE FIGURA SU METODO ABSTRACTO 

*/
package Parcial2.ClaseAbstracta;


public class Circulo extends Figura {
    //Atributo
    private double radio;
    //constructor vacio
    public Circulo() {
    }
    // cosntructor con parametros 
    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    // sobre escritura del metodo
    @Override
    public double calcularArea() {
        double area = Math.PI * radio;
        return area;
    }   
}
