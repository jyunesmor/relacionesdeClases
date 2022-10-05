/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicio;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Carga de Objeto persona
    public Persona cargaCliente() {
        Persona persona = new Persona();

        System.out.println("");
        System.out.println(" ---- Datos Personales ---- ");
        System.out.println("");
        System.out.println(" Ingrese nombre del cliente ");
        persona.setNombre(leer.next());
        System.out.println(" Ingrese apellido del cliente ");
        persona.setApellido(leer.next());
        System.out.println(" Ingrese edad del cliente ");
        persona.setEdad(leer.nextInt());
        System.out.println(" Ingrese N° de Documento del cliente ");
        persona.setDocumento(leer.next());
        // Inicia por defecto como no Asignado
        persona.setAdoptante(false);

        return persona;
    }

    public ArrayList<Persona> listadoClientes() {
        ArrayList<Persona> clientes = new ArrayList<>();

        boolean salir = false;
        do {
            Persona persona = cargaCliente();
            clientes.add(persona);
            System.out.println("¿Desea Cargar Otra Persona?");
            String op = leer.next();
            if (!op.equalsIgnoreCase("s")) {
                salir = true;
            }
        } while (salir != true);

        return clientes;
    }

    public void mostrarClientes(ArrayList<Persona> persona) {
        for (Persona cliente : persona) {
            System.out.println(cliente);
        }
    }

    public void mostrarClientesDisponibles(ArrayList<Persona> persona) {
         int c = 0;
        for (Persona cliente : persona) {
            if (cliente.getAdoptante() == false) {
                System.out.println(cliente);
            }
            if (c == 0) {
            System.out.println(" No hay Clientes disponibles para adopción");
            }
        }
    }

} // Fin Clase Persona
