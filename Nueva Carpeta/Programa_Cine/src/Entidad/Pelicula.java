/*

 */
package Entidad;

public class Pelicula {
    
    private String nombre;
    private double duracion;
    private int edad_min;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String nombre, double duracion, int edad_min, String director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edad_min = edad_min;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdad_min() {
        return edad_min;
    }

    public void setEdad_min(int edad_min) {
        this.edad_min = edad_min;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", edad_min=" + edad_min + ", director=" + director + '}';
    }
    
    
    
}
