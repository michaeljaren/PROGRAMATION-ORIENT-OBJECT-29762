
package Parcial2.e23figura;

public abstract class Figura {
    
    //Atributos
    private int dato;
    
    //cosntructor
    public Figura( int dato ){
        this.dato = 0;
    }

    
    
    //kmetrodo
    public abstract void calcularPerimetro();
    public abstract double CalcularArea();
    public void Saludo (){
        System.out.println(" jello ");
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
        
    
    
}
