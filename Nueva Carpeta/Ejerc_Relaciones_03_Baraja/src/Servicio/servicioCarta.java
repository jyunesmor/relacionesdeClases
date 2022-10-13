package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;

public class servicioCarta {

    ArrayList<Carta> lista = new ArrayList<>();
    Baraja baraja = new Baraja();
    
    public ArrayList<Carta> generarCarta() {
        for (int i = 0; i < 12; i++) {
            if ((i + 1) != 8 && (i + 1) != 9) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setPalo("Oro");
                lista.add(carta);
            }

        }
        for (int i = 0; i < 12; i++) {
            if ((i + 1) != 8 && (i + 1) != 9) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setPalo("Espada");
                lista.add(carta);
            }

        }
        for (int i = 0; i < 12; i++) {
            if ((i + 1) != 8 && (i + 1) != 9) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setPalo("Basto");
                lista.add(carta);
            }

        }
        for (int i = 0; i < 12; i++) {
            if ((i + 1) != 8 && (i + 1) != 9) {
                Carta carta = new Carta();
                carta.setNumero(i + 1);
                carta.setPalo("Copa");
                lista.add(carta);
            }

        }
        
        baraja.setBaraja(lista);
        return lista;
    }

    public void mostrarcartas() {
        for (Carta aux : baraja.getBaraja()) {
            System.out.println(aux.toString());
        }
    }

}
