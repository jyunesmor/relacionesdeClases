/*

 */
package Entidad;

public class Espectador {
    
    private String nombre;
    private int edad;
    private int saldo;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + '}';
    }
    
    
}
