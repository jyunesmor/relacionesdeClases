/*

 */
package Servicios;

import Entidad.Espectador;
import java.util.ArrayList;

public class servicioEspectador {
    
        ArrayList <Espectador> e = new ArrayList<>();
        Espectador espectador = new Espectador();
    
    public ArrayList <Espectador> cargaEspecatdores(){
        
        int cant = (int) (Math.random()*60);
       
        for (int i = 0; i < cant; i++) {
            double saldo = Math.random()* 1500;
            e.add(new Espectador("Espectador " +(i+1), (int)(Math.random()*65+1), (int)(Math.random()*3000+10)));
        }
//        e.add(new Espectador("Juan",39,750));
//        e.add(new Espectador("Carla",15,360));
//        e.add(new Espectador("Agus",22,500));
//        e.add(new Espectador("Marti",36,1500));
//        e.add(new Espectador("Matias",26,800));
        return e;
    }
    
}
