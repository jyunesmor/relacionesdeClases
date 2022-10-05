
import java.util.ArrayList;
import java.util.Scanner;


public class servicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
 

    public ArrayList <Perro> agregarPerro() {
        ArrayList <Perro> mascotas = new ArrayList<>();
        
        Perro p1 = new Perro("Pedro","Caniche",3,"Mediano");
        
        Perro p2 = new Perro("Mateo","Dogo",5,"Grande");
        
        mascotas.add(p1);
        mascotas.add(p2);
        
        return mascotas;
    }

    public void mostrarPerro(ArrayList <Perro> p) {
        for (Perro aux : p) {
            System.out.println(aux);
        }
    }

}
