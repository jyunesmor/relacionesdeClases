/*

 */
package Entidad;

public class Asiento {

    private String ubicacion;
    private Espectador e;

    public Asiento(String ubicacion, Espectador e) {
        this.ubicacion = ubicacion;
        this.e = e;
    }

    public Asiento() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Espectador getE() {
        return e;
    }

    public void setE(Espectador e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Asiento{" + "ubicacion=" + ubicacion + ", e=" + e + '}';
    }
    
    
}
