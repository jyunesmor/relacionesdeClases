/*

 */
package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioBaraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Baraja b = new Baraja();
    servicioCarta sc = new servicioCarta();
    ArrayList<Carta> bar = sc.generarCarta();

    public void barajar() {
        Collections.shuffle(bar);
        b.setBaraja(bar);
    }

    public void siguienteCarta() {
        System.out.println("");
        Iterator<Carta> it = b.getBaraja().iterator();
        int c = 0;
        while (it.hasNext()) {
            if (it.hasNext()) {
                System.out.println(" -- La Siguiente carta diponible es --".toUpperCase());
                System.out.println(b.getBaraja().get(c));
                break;
            } else {
                System.out.println("-- No Hay Cartas disponibles --");
            }
        }
    }

    public void darCartas() {
        int pos = 0;
        int c = 0;
        System.out.println(" ¿Cuantas Cartas quiere? ");
        int num = leer.nextInt();
        ArrayList<Carta> barent = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            barent.add(b.getBaraja().get(i));
        }
        b.setCartasentregadas(barent);
        for (int i = 0; i < num; i++) {
            b.getBaraja().remove(0);
        }

    }

    public void mostarbaraja() {

        System.out.println("");
        System.out.println(" --- Listado Cartas diponibles ---\n".toUpperCase());
        int i = 1;
        for (Carta carta : b.getBaraja()) {
            System.out.println(carta + " Carta n° " + i);
            i++;
        }
    }

    public void cartasMonton() {
        System.out.println("");
        System.out.println(" --- Listado Cartas Entregadas ---\n".toUpperCase());
        boolean flag = false;
        int i = 1;
        for (Carta carta : b.getCartasentregadas()) {
            if (b.getCartasentregadas().isEmpty()) {
                flag = true;
            } else {
                System.out.println(carta + " Carta n° " + i);
                i++;
            }
        }
        if (flag == true) {
            System.out.println("-- No hay Cartas entregadas --".toUpperCase());
        }
    }

    public void cartasDisponibles() {
        System.out.println("");
        System.out.println("-- Tamaño de la baraja de cartas disponibles -- \n".toUpperCase()
                + b.getBaraja().size() + " cartas.-".toUpperCase());
        System.out.println("-- Tamaño de la baraja de cartas entregadas -- \n".toUpperCase()
                + b.getCartasentregadas().size() + " cartas.-".toUpperCase());
    }
}
