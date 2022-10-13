/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
 */
package Entidades;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private String estado;
    private Perro mascota;
    private boolean Adoptante;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento, boolean Adoptante, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
        this.Adoptante = Adoptante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
          this.documento = documento;
    }

    public boolean getAdoptante() {
        return Adoptante;
    }

    public void setAdoptante(boolean Adoptante) {
        this.Adoptante = Adoptante;
    }

    public Perro getMascota() {

        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return " \n [" + " Nombre: " + nombre + ", Apellido: " + apellido + ", edad: " + edad + " años, DNI: " + documento + " Estado: " + Adoptante + "] \n La Mascota adoptada es: " + mascota;
    }

}
