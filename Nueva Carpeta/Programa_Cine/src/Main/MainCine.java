package Main;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Servicios.servicioCine;
import Servicios.servicioEspectador;
import Servicios.servicioPelicula;
import java.util.ArrayList;

public class MainCine {

    public static void main(String[] args) {

        servicioCine sc = new servicioCine();
        servicioEspectador se = new servicioEspectador();
        servicioPelicula sp = new servicioPelicula();

        ArrayList <Pelicula> pelicula = sp.cargaPeliculas();  // Carga de Espectadores
        ArrayList <Espectador> espectador = se.cargaEspecatdores(); // Carga de Peliculas

        Cine c = sc.cargaCine(espectador,pelicula); // Carga de Cine 
        sc.mostrarSala(); // mostramos las columnas de la sala
        System.out.println("");
        sc.mostrarPelicula(pelicula); // mostramos las peliculas disponibles
        System.out.println("");
        sc.mostrarEspectadores(espectador);
        
        sc.asignarEspectadores(espectador, pelicula);
        System.out.println("");
        sc.mostrarSala();
      
        System.out.println("");
    }

}
