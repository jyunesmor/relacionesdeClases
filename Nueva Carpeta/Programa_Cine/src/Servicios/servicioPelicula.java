/*

 */
package Servicios;


import Entidad.Pelicula;
import java.util.ArrayList;

public class servicioPelicula {
 
        ArrayList <Pelicula> p = new ArrayList<>();
        Pelicula peli = new Pelicula();
    
    public ArrayList <Pelicula> cargaPeliculas(){
        p.add(new Pelicula("It",200,15,"Jhon Deer"));
        p.add(new Pelicula("Esperando la Carroza",150,19,"Marco Polo"));
        p.add(new Pelicula("Ghost",160,13,"Antonio Banderas"));
        p.add(new Pelicula("Avatar",230,21,"Maradona"));
        p.add(new Pelicula("Titanic",600,21,"Di Caprio"));

        return p;
    }
    
    
}
