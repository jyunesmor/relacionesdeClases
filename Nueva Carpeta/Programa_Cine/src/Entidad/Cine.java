/*

 */
package Entidad;

import java.util.ArrayList;

public class Cine {
    
    private ArrayList <Pelicula> pelicula;
    private ArrayList <Espectador> espectador;
    private ArrayList <String> asientolibre;
    private Asiento sala[][];
    private int valor; 

    public Cine() {
    }

    public Cine(ArrayList<Pelicula> pelicula, ArrayList<Espectador> espectador,ArrayList<String> asientolibre, Asiento[][] sala, int valor) {
        this.pelicula = pelicula;
        this.espectador = espectador;
        this.asientolibre = asientolibre;
        this.sala = sala;
        this.valor = valor;
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<String> getAsientolibre() {
        return asientolibre;
    }

    public void setAsientolibre(ArrayList<String> asientolibre) {
        this.asientolibre = asientolibre;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", espectador=" + espectador + ", asientolibre=" + asientolibre + ", sala=" + sala + ", valor=" + valor + '}';
    }


    
}
