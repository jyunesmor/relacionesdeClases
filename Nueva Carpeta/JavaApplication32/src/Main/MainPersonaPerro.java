/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Main;

import Entidades.Perro;
import Entidades.Persona;
import Servicio.ServicioPerro;
import Servicio.ServicioPersona;
import java.util.ArrayList;

import java.util.Scanner;

public class MainPersonaPerro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPerro p = new ServicioPerro();
        ServicioPersona sp = new ServicioPersona();
        ArrayList <Persona> clientes = null;
        ArrayList <Perro> mascota = null;
 
        boolean salir = false;
        boolean bandera = false;
        
     do {  
         
        System.out.println(" ----- Menu ----- ");
        System.out.println("");
        System.out.println(" Seleccione la Acción a realizar");
        System.out.println("1. Ingresar Clientes");
        System.out.println("2. Ingresar Mascotas");
        System.out.println("3. Asignar Mascota");
        System.out.println("4. Listados");
        System.out.println("5. salir");
        System.out.println("");

        int ops = leer.nextInt();

        switch (ops) {
            case 1:  // "1. Ingresar Clientes"
                clientes = sp.listadoClientes();
                break;
            case 2:  // "2. Ingresar Mascotas"
                mascota = p.listadoMascotas();
                break;
            case 3:  // "3. Asignar Mascota"
                sp.asignarMascota(mascota, clientes);
                break;
            case 4:   // "4. Mostrar Mascotas y Personas Disponibles"
                    boolean op = false;
                    do{
                        System.out.println("");
                        System.out.println(" ----- Menu Listados ----- ");
                        System.out.println("");
                        System.out.println(" Seleccione la Acción a realizar");
                        System.out.println("1. Listado Total de Clientes");
                        System.out.println("2. Listado Total de Mascotas");
                        System.out.println("3. Listado de Clientes Disponibles");
                        System.out.println("4. Listado de Mascotas Dispoibles");
                        System.out.println("5. salir");
                        int list = leer.nextInt();
                        switch (list) {
                            case 1:
                                System.out.println(" El Listado de Clientes Disponibles son: ");
                                System.out.println("");
                                sp.mostrarClientes(clientes);
                                break;
                            case 2:
                                System.out.println(" El Listado de Mascotas es: ");
                                System.out.println("");
                                p.mostrarMascota(mascota);
                                break;
                            case 3:
                                System.out.println(" El Listado de Clientes Disponibles son: ");
                                System.out.println("");
                                sp.mostrarClientesDisponibles(clientes);
                                break;
                            case 4:
                                System.out.println(" El Listado de Mascotas Disponibles son: ");
                                System.out.println("");
                                p.mostrarMascotaDisponibles(mascota);
                                break;
                            case 5:
                                op = true;
                                break;
                            default:
                               System.out.println("La Opcion seleccionada no es correcta, ingrese nuevamente");
                        }
                    }while(op != true);
                break;
            case 5:  // "5. Salir"
                bandera = true;
                break;
            default:
                System.out.println("La Opcion seleccionada no es correcta, ingrese nuevamente");
        }
        
     }while(bandera != true);
             
    }

} // Fin Clase Main