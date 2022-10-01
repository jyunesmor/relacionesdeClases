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

    ServicioPersona sper = new ServicioPersona();
    Persona p = new Persona();
 



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
        ArrayList<Perro> mascotas = new ArrayList<>();
       
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

    public void asignarMascota() {
        // Asigno Mascota
        ArrayList<Persona> clientes = sper.obtenerClientes();
        System.out.println("¿Que Mascota desea Asignar?");
        String nombre = leer.next();
        System.out.println("");
        for (int i = 0; i < masc.getPerro().size(); i++) {
            // Busco mascota dentro del Listado
            if (masc.getPerro().get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(p.getClientes().toString());
                System.out.println("");
                // Asigno Cliente 
                System.out.println(" ¿Ingrese el Nombre de la Persona Adoptante? ");
                String nombrePer = leer.next();
                System.out.println("");
                // Busco CLiente y asigno cliente a Pesona de Mascota
                if (p.getClientes().get(i).getNombre().equalsIgnoreCase(nombrePer)) {
                     masc.getPerro().get(i).setP(p.getClientes().get(i));
                     p.getClientes().get(i).setAdoptante(true); // Declaro al cliente como no disponible
                    break;
                }
            } // fin IF comparar nombres de Mascota
        }

    }

}  // Fin Clase Servicio

