package Entidad;

public class Revolver {

    private int pos_actual;

    private int pos_agua;

    public Revolver() {
    }

    public Revolver(int pos_actual, int pos_agua) {
        this.pos_actual = pos_actual;
        this.pos_agua = pos_agua;
    }

    public int getPos_actual() {
        return pos_actual;
    }

    public void setPos_actual(int pos_actual) {
        this.pos_actual = pos_actual;
    }

    public int getPos_agua() {
        return pos_agua;
    }

    public void setPos_agua(int pos_agua) {
        this.pos_agua = pos_agua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "pos_actual=" + pos_actual + ", pos_agua=" + pos_agua + '}';
    }
    
    
    
}
