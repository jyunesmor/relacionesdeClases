
package Main;

import Entidades.Perro;
import Entidades.Persona;
import Servicio.ServicioPerro;
import Servicio.ServicioPersona;
import java.util.ArrayList;


public class NewMain {

    public static void main(String[] args) {

        
        ServicioPersona sp = new ServicioPersona();
        ServicioPerro s = new ServicioPerro();
     
        ArrayList<Persona> clientes = sp.listadoClientes();
        sp.mostrarClientes(clientes);
        
        ArrayList<Perro> mascotas = s.listadoMascotas();
        s.mostrarMascota(mascotas);
        
    }
    
}
