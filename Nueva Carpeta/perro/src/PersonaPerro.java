
import java.util.ArrayList;


public class PersonaPerro {

    public static void main(String[] args) {
    
        servicioPerro s = new servicioPerro();
        servicioPersona sp = new servicioPersona();
        
        
        
         ArrayList <Perro> dog = s.agregarPerro();
         ArrayList <Persona> human = sp.agregarPersona();
      
        s.mostrarPerro(dog);
        sp.mostrarPersona(human);
        
        sp.adoptarPerro(dog,human);
        
        
    }
    
}
