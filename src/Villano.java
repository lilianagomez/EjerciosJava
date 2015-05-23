/**
 *
 * @author Lilianag
 */
public class Villano {

    String nombre;
    boolean estaVivo = true;
    
    public boolean matar(){
        return estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    
    
}
