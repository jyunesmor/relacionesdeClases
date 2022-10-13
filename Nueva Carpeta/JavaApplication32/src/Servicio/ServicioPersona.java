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
                c++;
            }
        }
        if (c == 0) {
            System.out.println(" No hay Clientes disponibles para adopción");
        }
    }

    public void asignarMascota(ArrayList<Perro> mascota, ArrayList<Persona> clientes) {
        // Asigno Mascota
        boolean flag = false;
        int op = 1;
        int ops = 1;
        do {

            for (Perro perro : mascota) {  // Busco mascota dentro del ArrayList
                for (Persona per : clientes) { // Busco cliente dentro del ArrayList 

                }
            }

            System.out.println("¿Desea continuar asignando mascotas?");
            String opa = leer.next();
            if (!opa.equalsIgnoreCase("s")) {
                flag = true;
            }
        } while (flag != true);

    }

} // Fin Clase Persona

//do {
//                        System.out.println("¿Que Mascota desea Asignar?");
//                        String nombre = leer.next();
//                        System.out.println("");
//
//                        if (perro.getNombre().equalsIgnoreCase(nombre) && perro.getEstadoAdopcion() == false) {
//                            System.out.println(perro.getNombre().toUpperCase() + ", se encuentra para Adopcion");
//                            System.out.println("");
//                            do {
//                                System.out.println("");
//                                System.out.println(" ¿Indique el Nombre de la Persona que la Adoptara? ");
//                                String nombrePer = leer.next();
//                                //  Busco Cliente y asigno cliente al Objeto Persona de la Mascota
//                                if (per.getNombre().equalsIgnoreCase(nombrePer) && per.getAdoptante() == false) {
//                                    per.setAdoptante(true); // Declaro al cliente como Adoptante
//                                    perro.setEstadoAdopcion(true); // Declaro a la Mascota adoptada
//                                    per.setMascota(perro);
//                                    System.out.println(" Asigno correctamente a " + perro.getNombre().toUpperCase() + " a su nueva/o Adoptante " + per.getNombre().toUpperCase());
//                                    break;
//                                } else {
//                                    System.out.println(" La Persona ya es Adoptante de otra Mascota");
//                                    ops = 1;
//                                }
//                            } while (ops != 4);
//                            op = 4;
//                        } else {
//                            System.out.println(perro.getNombre().toUpperCase() + ", ya fue adoptada/o");
//
//                        }
//                    } while (op != 4);
//
//                }
//            }
//            System.out.println("¿Desea continuar asignando mascotas?");
//            String opa = leer.next();
//            if (!opa.equalsIgnoreCase("s")) {
//                flag = true;
//            }
