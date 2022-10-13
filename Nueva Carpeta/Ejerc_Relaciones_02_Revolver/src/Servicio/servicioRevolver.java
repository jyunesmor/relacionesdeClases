package Servicio;

import Entidad.Revolver;

public class servicioRevolver {
    
    Revolver r = new Revolver();
    

    public void llenarRevolver() {
        int actual = (int) (Math.random()*6+1);
        r.setPos_actual(actual);
        int agua = (int) (Math.random()*6+1);
        r.setPos_agua(agua);
    }

    public boolean mojar() {
        if (r.getPos_actual()==r.getPos_agua()) {
            return true;
        }
        return false;
    }

    public void siguienteChorro() {

        r.setPos_actual(r.getPos_actual()+1);

        if (r.getPos_actual()<=6) {
                r.setPos_actual(r.getPos_actual());
            } else {
                r.setPos_actual(1); 
        }
    }

    public void mostrar() {
        System.out.println(" La Posicion de Agua del Revolver es: " + r.getPos_agua());
        System.out.println(" La Posicion Actual del Revolver es: " + r.getPos_actual());
    }
}
