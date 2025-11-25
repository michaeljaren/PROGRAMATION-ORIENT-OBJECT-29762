
package e22Agregacion;



//clase que permite 
public class Cliente {
    //atributos
    private String cedula;
    private String nombre;
    
    //constructor por defecto
    public Cliente (){
        cedula = null;
        nombre = null;
    }

    //metodo para mosrtar
    public String Mostrar() {
        return "Cliente" + "\nCedula:" + cedula + " | Nombre:" + nombre ;
    }
    //get and set

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
