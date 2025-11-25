/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
CARRERA SOFTWARE 
NOMBRE: MICHAEL JAREN           PERIODO: PREGADO SII OCTUBRE25 - MARZO26
ASIGNATURA: POO                 NRC: 29762
TEMA: CLASE HIJA CUADRADO EL CUAL HEREDA DE FIGURA SU METODO ABSTRACTO 

*/
package ClaseAbstracta;


public class Cuadrado extends Figura {
    //Atributos
    private double lado;
    //constructor vacio
  
    public Cuadrado() {
    }
    //constructor con parametros
    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

}
