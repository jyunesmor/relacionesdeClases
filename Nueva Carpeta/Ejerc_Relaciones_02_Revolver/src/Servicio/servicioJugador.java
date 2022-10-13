package Servicio;


import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class servicioJugador {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Jugador j = new Jugador();
    
    public ArrayList <Jugador> ingresoJugadores(){

        ArrayList <Jugador> jugador = new ArrayList <>();
        int jugada;
        System.out.println(" Ingrese cantidad de Jugadores a participar de 1 a 6");
        int jug = leer.nextInt();
        if (jug > 6) {
           jugada = 6;
        } else {
           jugada = jug;
        }
        for (int i = 0; i < jugada; i++) {
            System.out.println(" ingrese el Nombre del " + (i+1) + " jugador"); 
            String nombre = leer.next();
            boolean mojado = false;
            j = new Jugador(i,nombre,mojado);
            jugador.add(j);
        }
        return jugador;
    }
    
    public boolean disparo(servicioRevolver sr) {
        sr.siguienteChorro();
        if (sr.mojar()==true) {
              return true;
        } 
        return false;
    }


}
