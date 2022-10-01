/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
 */
package Entidades;



public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private Persona p;
    private boolean estadoAdopcion;


    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamano, boolean estadoAdopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.estadoAdopcion = estadoAdopcion;
    }

    public Perro(String nombre, String raza, int edad, String tamano, Persona p) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.p = p;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public boolean getEstadoAdopcion() {
        return estadoAdopcion;
    }

    public void setEstadoAdopcion(boolean estadoAdopcion) {
        this.estadoAdopcion = estadoAdopcion;
    }

    
    @Override
    public String toString() {
        return " \n [ " + "Nombre:" + nombre + ", Raza: " + raza + ", Edad: " + edad + " años, de Tamaño: " + tamano + " Estado Adopcion: " + estadoAdopcion + " ]";
    }

    

    
}
