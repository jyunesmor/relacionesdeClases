
public class PersonaPerro {

    public static void main(String[] args) {
    
        servicioPerro s = new servicioPerro();
        servicioPersona sp = new servicioPersona();
        
        
        
        
      
        s.mostrarPerro(s.agregarPerro());
        sp.mostrarPerro(sp.agregarPersona());
        
        sp.adoptarPerro(s.agregarPerro(),sp.agregarPersona());
        
        
    }
    
}
