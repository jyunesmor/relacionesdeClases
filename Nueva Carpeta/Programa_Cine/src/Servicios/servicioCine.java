/*

 */
package Servicios;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Utilidades.Columna;
import java.util.ArrayList;
import java.util.Scanner;

public class servicioCine {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cine c = new Cine();
    Asiento s[][] = new Asiento[8][6];

    public Cine cargaCine(ArrayList<Espectador> espectador, ArrayList<Pelicula> pelicula) {
        c.setEspectador(espectador);

        c.setPelicula(pelicula);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer a = 8 - i;
                String b = a.toString();
                switch (j) {
                    case 0:
                        b = b.concat("A");
                        break;
                    case 1:
                        b = b.concat("B");
                        break;
                    case 2:
                        b = b.concat("C");
                        break;
                    case 3:
                        b = b.concat("D");
                        break;
                    case 4:
                        b = b.concat("E");
                        break;
                    case 5:
                        b = b.concat("F");
                        break;
                    default:
                        throw new AssertionError();
                }
                s[i][j] = new Asiento(b, null);
            }
        }
        c.setSala(s);

        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < 8; i++) {
            for (Columna aux : Columna.values()) {
                String asiento = (8 - i) + aux.toString();
                a.add(asiento);
            }
        }
        c.setAsientolibre(a);
        
        int valor = 300;
        c.setValor(valor);
        return c;
    }  // Fin Carga de Cine

    public void mostrarSala() {
        Asiento as[][] = c.getSala();  // Obtener los Asientos del Objeto

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(as[i][j]);
            }
            System.out.println("");
        }
    } // Fin Mostrar Sala

    public void mostrarPelicula(ArrayList<Pelicula> pelicula) {
        for (Pelicula list : pelicula) {
            System.out.println(list.toString());
        }
    } // Fin Mostrar Pelicula

    public void mostrarEspectadores(ArrayList<Espectador> espectador) {
        for (Espectador list : espectador) {
            System.out.println(list.toString());
        }
    } // Fin Mostrar Espectadores

    public void asignarEspectadores(ArrayList<Espectador> espectadores, ArrayList<Pelicula> pelicula) {
        int admitido = 0;
        int rechazado = 0;
        System.out.println("");
        System.out.println(" ¿Ingrese la Pelicula a Asignar? ");
        int op = leer.nextInt();
        for (Espectador espectador : espectadores) {
            if (espectador.getEdad() >= pelicula.get(op).getEdad_min()
                    && espectador.getSaldo() >= c.getValor() 
                    && c.getAsientolibre().size() > 0) {
                int posicion = (int) (Math.random() * c.getAsientolibre().size());
                String ubicacion = c.getAsientolibre().get(posicion);
                c.getAsientolibre().remove(posicion);

                Asiento asi[][] = c.getSala();  // Obtener los Asientos del Objeto
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (asi[i][j].getUbicacion().equals(ubicacion)) {
                            asi[i][j].setE(espectador);
                        }
                    }
                }
                admitido++;
            } else {
                rechazado++;
            }
        }  // Fin Comparacion para carga Espectador
        System.out.println(" El Valor de la entrada es: $ " + c.getValor());
        System.out.println(" Los Espectadores Creado son: " + espectadores.size());
        System.out.println(c.getAsientolibre().size());
        System.out.println(" Las Personas Admitidas Son: " + admitido);
        System.out.println(" Las Personas Rechazados Son: " + rechazado);

    }

    public void mostrarCine() {

    }

}
