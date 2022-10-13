
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;

public class servicioJuego {

    Juego j = new Juego();

    public void llenarJuego(ArrayList <Jugador> jugadores, Revolver r) {
       j = new Juego(jugadores, r);
    }

    public boolean ronda(servicioRevolver sr, servicioJugador sj) {
        if (sj.disparo(sr)==true) {
            return true;
        } 
        return false;
    }
    
}
