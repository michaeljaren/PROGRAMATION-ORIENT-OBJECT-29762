/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 20/10/2025
  Tema: La clase Programador  
*/ 
package e05Persona;

public class Programador extends Persona {
    
    String soFavorito;
    String marcaPC;

    public Programador(){
        soFavorito=null;
        marcaPC="ALIENWARE";
    }
    
    
    @Override
    public void imprimirSaludo(){
        System.out.println("Hola, soy una persona, me llamo: "+nombre+ 
                " Mi PC ES:  " +marcaPC);}
    

    
    
    
   


}
