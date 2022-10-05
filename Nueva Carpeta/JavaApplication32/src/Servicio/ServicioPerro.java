/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ServicioPersona sp = new ServicioPersona();
    Persona p = new Persona();

    ArrayList<Perro> mascotas = new ArrayList<>();
    ArrayList<Persona> clientes = null;

    // Carga de Objeto Mascota 
    private Perro cargaMascota() {
        Perro mascota = new Perro();

        System.out.println("");
        System.out.println(" ---- Datos Mascota ---- ");
        System.out.println("");
        System.out.println(" Ingrese nombre de la Mascota ");
        mascota.setNombre(leer.next());
        System.out.println(" Ingrese Raza de la Mascota ");
        mascota.setRaza(leer.next());
        System.out.println(" Ingrese Edad de la Mascota ");
        mascota.setEdad(leer.nextInt());
        System.out.println(" Ingrese Tamaño de la Mascota ");
        System.out.println(" Chico / Mediano / Grande ");
        mascota.setTamano(leer.next());
        // Inicia por defecto como no Asignado
        mascota.setEstadoAdopcion(false);

        return mascota;
    }  // Funcion para devolver la carga de una mascota

    public ArrayList<Perro> listadoMascotas() {
//        ArrayList<Perro> mascotas = new ArrayList<>();

        boolean salir = false;
        do {
            Perro mascota = cargaMascota();
            mascotas.add(mascota);
            System.out.println("¿Desea Cargar Otra Mascota?");
            String op = leer.next();
            if (!op.equalsIgnoreCase("s")) {
                salir = true;
            }
        } while (salir != true);

        return mascotas;
    } // Funcion para devolver listado de mascotas

    public void mostrarMascota(ArrayList<Perro> listadoMascotas) {
        for (Perro perro : listadoMascotas) {
            System.out.println(perro);
        }
    } // Funcion para mostrar listado de mascotas

    public void mostrarMascotaDisponibles(ArrayList<Perro> listadoMascotas) {
        int c =0;
        for (Perro perro : listadoMascotas) {
            if (perro.getEstadoAdopcion() == false) {
                System.out.println(perro);
                c++;
            } 
            if (c == 0) {
            System.out.println(" No hay Mascotas disponibles para adopción");
            }
        }
    } // Funcion para mostrar listado de mascotas

    public void asignarMascota(ArrayList<Perro> mascota, ArrayList<Persona> clientes) {
        // Asigno Mascota
        System.out.println("¿Que Mascota desea Asignar?");
        String nombre = leer.next();
        System.out.println("");
        for (int i = 0; i < mascota.size(); i++) {
            // Busco mascota dentro del Listado
            if (mascota.get(i).getNombre().equalsIgnoreCase(nombre) && mascota.get(i).getEstadoAdopcion() == false) {
                // Asigno Cliente 
                System.out.println(mascota.get(i).getNombre().toUpperCase() + ", se encuentra para Adopcion");
                System.out.println("");
                System.out.println(" ¿Indique el Nombre de la Persona que la Adoptara? ");
                String nombrePer = leer.next();
                for (int j = 0; j < clientes.size(); j++) {
                    // Busco Cliente y asigno cliente al Objeto Persona de la Mascota
                    if (clientes.get(j).getNombre().equalsIgnoreCase(nombrePer) && clientes.get(j).getAdoptante() == false) {
                        clientes.get(j).setAdoptante(true); // Declaro al cliente como Adoptante
                        mascota.get(j).setEstadoAdopcion(true); // Declaro a la Mascota adoptada
                        System.out.println(" Asigno correctamente a " + mascota.get(j).getNombre() + " a su nueva/o Adoptante " + clientes.get(j).getNombre());
                        break;
                    }
                }

            }// fin IF comparar nombres de Mascota

        }
    }

}  // Fin Clase Servicio

