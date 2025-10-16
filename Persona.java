/* UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
  SOFTWARE 
  NOMBRE: MICHAEL BARRAGAN        PERIODO: PREGRADO
  Asignatura: POO                     NRC:29762
  Fecha: 15/10/2025
  Tema: La clase Persona
*/ 
//librerias 
package e05Persona;
import java.util.Scanner;

public class Persona {
    //Atributros Variables globales
    private String nombre; 
    //toUpperCase para MAYUSCULAS y toLowerCase para minusculas 
    private byte edad;
    private String sexo;
     private String mensaje;
    

    //Metodos:
     //Metodo llamado constructor vacio o por defecto
     //metodo1
    public Persona( String nombre, byte edad, String sexo, String mensaje) {
        
        this.edad = edad;
        this.sexo = "masculino";
        this.mensaje = "otro";
    }
    
    public Persona(String nombre){
        this.mensaje= " tu nombre ";
    }
   
    
    //metodo3 - metodo del usuario 
    public  void imprimirSaludo(){
        System.out.println(" Hola , me llamo "+getNombre());
    }
    
    //get and set 

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * @return the edad
     */
    public byte getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    

   
    

}



 //Metodo que no tiene argumentos
    /*
    public static void main(String[] args ){
        //Atributos-Variables locales
        int numero1,numero2,numero3,suma=0,resta,multiplicacion,division,promedio;
        //Ingreso de datos
        System.out.print(" Ingrese un numero: ");
        numero1=leer.nextInt();
        System.out.print(" Ingrese un numero: ");
        numero2=leer.nextInt();
        //Proceso
        numero3= sumarNumeros ( numero1, numero2, suma); //argumento yo envio valores
        System.out.println("La suma es: "+numero3);
        //Mostrar Datos
        imprimirSaludo();

    }
    public static int  sumarNumeros(int numero11,int numero12,int sumas){ //parametro yo creo los valores
        sumas = numero11 +numero12;
        System.out.println(" La suma es: " +sumas);
        return sumas;
    }
*/