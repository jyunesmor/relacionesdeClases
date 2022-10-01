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
        ServicioPerro s = new ServicioPerro();
        ServicioPersona sp = new ServicioPersona();
 
        boolean salir = false;
        boolean bandera = false;
        
     do {  
         
        System.out.println(" ----- Menu ----- ");
        System.out.println("");
        System.out.println(" Seleccione la Acción a realizar");
        System.out.println("1. Ingresar Clientes");
        System.out.println("2. Ingresar Mascotas");
        System.out.println("3. Asignar Mascota");
        System.out.println("4. Mostrar Mascotas y Personas Disponibles");
        System.out.println("5. salir");
        System.out.println("");

        int ops = leer.nextInt();

        switch (ops) {
            case 1:  // "1. Ingresar Clientes"
                sp.obtenerClientes();
                break;
            case 2:  // "2. Ingresar Mascotas"
                s.obtenerMascotas();
                break;
            case 3:  // "3. Asignar Mascota"
                s.asignarMascota();
                break;
            case 4:   // "4. Mostrar Mascotas y Personas Disponibles"
                System.out.println(" El Listado de Mascotas Disponibles son: ");
                s.mostrarMascota();
                System.out.println("");
                System.out.println(" El Listado de Clientes Disponibles son: ");
                sp.mostrarClientes();
                break;
            case 5:  // "5. Salir"
                bandera = true;
                break;
            default:
                System.out.println("La Opcion seleccionada no es correcta, ingrese nuevamente");
        }
        
     }while(bandera != true);
    }

}
