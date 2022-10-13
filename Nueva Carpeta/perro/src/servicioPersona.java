
import java.util.ArrayList;
import java.util.Scanner;


public class servicioPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    

   public ArrayList <Persona> agregarPersona() {
        ArrayList <Persona> usuarios = new ArrayList<>();
        
        Persona p1 = new Persona("Leonardo","Lopez",45365897,35, null);
        
        Persona p2 = new Persona("Carlos","Bosio",10010487,75, null);
        
        usuarios.add(p1);
        usuarios.add(p2);
        
        return usuarios;
    }

    public void mostrarPersona(ArrayList <Persona> p) {
        for (Persona aux : p) {
            System.out.println(aux);
        }
    }

    public void adoptarPerro(ArrayList <Perro> p,ArrayList <Persona> usuarios) {
   
        System.out.println(" Ingrese la mascota a Adoptar");
        String masco = leer.next();
        System.out.println(" Ingrese la Persona Adoptante");
        String pers = leer.next();

        for (Perro perro : p) {
           for (Persona per : usuarios)
            if (perro.getNombre().equalsIgnoreCase(masco) && per.getNombre().equalsIgnoreCase(pers)) {
                per.setPerro(perro);
                System.out.println(per.toString());
            }
        }
    }
}
