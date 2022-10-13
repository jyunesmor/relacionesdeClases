
package Main;

import Entidad.Baraja;
import Entidad.Carta;
import Servicio.ServicioBaraja;
import Servicio.servicioCarta;
import java.util.Scanner;

public class MainBaraja {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioBaraja sb = new ServicioBaraja();
        servicioCarta sc = new servicioCarta();
        Carta c = new Carta();
        

        sb.barajar();
        sb.mostarbaraja();
        sb.siguienteCarta();
        System.out.println("");
        sb.darCartas();
        sb.cartasMonton();
        sb.mostarbaraja();
        sb.cartasDisponibles();
        sb.siguienteCarta();
        System.out.println("");
    }
    
}
