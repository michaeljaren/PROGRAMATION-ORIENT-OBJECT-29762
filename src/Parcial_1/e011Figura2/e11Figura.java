/*
 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
 SOFTWARE 
 NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
 Asignatura:                     NRC: 29762
 Fecha: 22/10/2025
 Tema: Programa que me permite usar la herencia para ver las figuras
*/
package e011Figura;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class e11Figura {
    //atributos 
    private int id;
    private String nombre = " Michael";
    
   //Constructor

    public e11Figura() {
        this.id = 0;
        this.nombre = " Michael";
    }
    
    //Metodos del usuario 
    
    //Metodo para ingresar los Datos de la figura
    public void ingresarDatos(){
        //Creamos el objeto escanner para leer datos
        Scanner leer = new Scanner (System.in);
        //leemos datos 
        System.out.println(" Ingrese el id: ");
        setId(leer.nextInt());
        leer.nextLine();

        //id = leer.nextInt();
        System.out.println("Ingrese el nombre: ");
        setNombre(leer.nextLine());
    }
    
    //metodo To String 
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre ;
    }
    
    //get and set 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
    
}
