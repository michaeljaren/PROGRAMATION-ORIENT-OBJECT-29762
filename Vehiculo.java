/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e06Vehiculo;

import java.util.Scanner;

/**
 *
 * @author LABS-ESPE
 */
public class Vehiculo {
    
    //Atributos
    private String numeroChasis;
    private String marca;
    private String modelo;
    private float precio;
    private int anio;
    
    //Constructor o vacio
    public Vehiculo(){
        this.numeroChasis=null;
        this.marca=null;
        this.modelo=null;
        this.precio=0;
        this.anio=0;
    }
    //Metodos de usuario
    //ingresar datos
    public void ingresarDato(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de chasis: ");
        //numeroChasis = leer.nextLine();
        setNumeroChasis(leer.nextLine());//numeroChasis con set
        System.out.print("Ingrese la marca: ");
        setMarca(leer.nextLine());
        System.out.print("Modelo: ");
        setModelo(leer.nextLine());
        System.out.print("Ingrese el precio: ");
        setPrecio(leer.nextFloat());
        System.out.print("Ingrese el anio: ");
        setAnio(leer.nextInt());
    }
    public String  mostrarDatos(){
        return ("Numero de casis: "+getNumeroChasis() +
                "\n Marca: "+getMarca() + 
                "\nModelo: "+getModelo() +
                "Precio: "+getPrecio()+ 
                "\nAnio: "+getAnio()
        );
    }
    //to String 

    @Override
    public String toString() {
        return "Vehiculo{" + "numeroChasis=" + numeroChasis 
                + ", marca=" + marca 
                + ", modelo=" + modelo 
                + ", precio=" + precio 
                + ", anio=" + anio + '}';
    }
    
    //get 

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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}


    

