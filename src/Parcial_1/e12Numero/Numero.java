package e12Numero;

import java.util.Scanner;

class Numero {
    private int valor; 

    public Numero(int valor) {
        this.valor = valor; // usar el valor pasado
    }
    
    //Constructoir vacio
    public Numero(){
        
    }
        

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    // Ingresar dato
    public void ingresarValor(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor: ");
        this.valor = leer.nextInt();
    }
    
    public void mostrarValor(){
        System.out.println("Su nmumero es: "+getValor());
    }
    
    public void verValorSuma(){
        
        System.out.println("El resultado de la suma es = ");
    }

}


