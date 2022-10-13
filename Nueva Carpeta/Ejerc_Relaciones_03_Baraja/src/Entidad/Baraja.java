
package Entidad;

import java.util.ArrayList;

public class Baraja {
    
      private ArrayList <Carta> baraja;
      private ArrayList <Carta> cartasentregadas;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getCartasentregadas() {
        return cartasentregadas;
    }

    public void setCartasentregadas(ArrayList<Carta> cartasentregadas) {
        this.cartasentregadas = cartasentregadas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }

}
