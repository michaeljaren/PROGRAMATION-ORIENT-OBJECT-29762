/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e05Persona;

/**
 *
 * @author LABS-ESPE
 */
public class Futbolista  extends Persona {
    //Atributos
    String equipo;
    String posicion;
    
    //metodo 
    //Constructor por defectos
    
    public Futbolista(){
        nombre= " KROSS";
        equipo = "FC";
    }
    
    

    public void imprimirSaludo(){
        System.out.println("Hola me llamo LUKA y mi jugador favorito es:" +nombre);

    }
    
    
}
