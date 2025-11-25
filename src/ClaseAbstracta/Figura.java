/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
CARRERA SOFTWARE 
NOMBRE: MICHAEL JAREN           PERIODO: PREGADO SII OCTUBRE25 - MARZO26
ASIGNATURA: POO                 NRC: 29762
TEMA: CLASE ABSTRACTA FIGURA   


*/
package ClaseAbstracta;
public abstract class Figura {

    //atributos
    //posicion en X y en Y
    protected double x;
    protected double y;
    
    //costrucotr vacio
    protected Figura() {
    } 

    //constructor con parametros
    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    } 

    //metodo abstracto
    public abstract double calcularArea();
}
