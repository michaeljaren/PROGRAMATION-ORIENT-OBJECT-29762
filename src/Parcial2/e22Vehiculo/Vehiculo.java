





package Parcial2.e22Vehiculo;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Vehiculo {
     
    //declaracion de atributos
    private String numeroChasis;
    //no dueño pq no es parte del carro
    private String marca;
    private double precio;
    
    //constructor por defecto o vacio
    public Vehiculo() {
        this.numeroChasis = null;
        this.marca = null;
        this.precio = 0;
    }
    
    //metodos para ingresar datos
    public void ingresarDatos () {
        
        //decalracion de variables
        Scanner sc = new Scanner(System.in);
        
        //lee los datos del vehiculo
        System.out.println("=====INGRESE DATOS DEL VEHICULO=====");
        System.out.println("Ingrese del numeroChasis vehiculo: ");
        setNumeroChasis(sc.nextLine());
        System.out.println("Ingrese del marca vehiculo: ");
        setMarca(sc.nextLine());
        System.out.println("Ingrese del precio vehiculo: ");
        setPrecio(sc.nextFloat());
        System.out.println("===================================");
    }

    
    public String toString() {
        return "Vehiculo" +"\nnumero de Chasis:" + getNumeroChasis() 
                + "|marca:" + getMarca() 
                + "|precio:" + getPrecio();
    }

    /**
     * @return the numeroChasis
     */
    public String getNumeroChasis() {
        return numeroChasis;
    }

    /**
     * @param numeroChasis the numeroChasis to set
     */
    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
     
}
