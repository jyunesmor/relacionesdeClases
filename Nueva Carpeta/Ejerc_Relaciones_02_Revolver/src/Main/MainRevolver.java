package Main;

import Entidad.Jugador;
import Servicio.servicioJuego;
import Servicio.servicioJugador;
import Servicio.servicioRevolver;
import java.util.ArrayList;


public class MainRevolver {

    public static void main(String[] args) {

        servicioRevolver sr = new servicioRevolver();
        servicioJuego sj = new servicioJuego();
        servicioJugador sjug = new servicioJugador();

        sr.llenarRevolver();
        sr.mostrar();
        ArrayList<Jugador> participantes = sjug.ingresoJugadores();
        boolean bandera = false;

        do {
            for (Jugador aux : participantes) {
                boolean band = sj.ronda(sr, sjug);
                if (band == true) {
                    System.out.println(" El Disparo fue de agua, " + aux.getNombre().toUpperCase() + " se Mojo.- ");
                    bandera = true;
                    break;
                } else {
                    System.out.println(" El Disparo fue nulo, sigue el juego para "
                            + aux.getNombre().toUpperCase());
                    sr.mostrar();
                    System.out.println("");
                    System.out.println(" ----- Siguiente Disparo ----- ");
                    System.out.println("");
                    bandera = false;
                }
            }
        } while (bandera != true);

        sr.mostrar();
        System.out.println("");
    }

}
