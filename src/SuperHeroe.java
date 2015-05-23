/**
 * Esta clase define los atributos y métodos que pued tener un super heroe
 *
 * @author Lilianag
 */
public class SuperHeroe {

    private String nombre;
    private boolean esVengador = false;
    private int cantVida;
    //Constructor que inicializa el super Heroe con el nombre
    public SuperHeroe(String nombre) {
        this.nombre = nombre;
    }
/**
 * Este método realiza la lucha contra un villano
 * @param x - Villano contra el que va a luchar
 * @param duracion - duración de la pelea en segundos
 * @return  - False: si mujrio el super heroe; true: si gano la pelea
 */
    public boolean luchar(Villano x, int duracion) {
        x.matar();
         duracion = 10;
         return false;
    }

    private void sumarVida(){
        cantVida+=1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsVengador() {
        return esVengador;
    }

    public void setEsVengador(boolean esVengador) {
        //Validación de seguridad
        this.esVengador = esVengador;
    }
    
    
}
