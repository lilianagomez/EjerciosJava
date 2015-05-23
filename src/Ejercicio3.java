import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

/**
 *
 * @author Lilianag
 */
public class Ejercicio3 {

    static Logger log = Logger.getLogger(Ejercicio1.class.getName());

    public static void main(String[] args) {

        BufferedReader leerEntradaUsuario = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        int nota, calificacion = 0, promedio;
        try {
            System.out.print("Nombre: ");
            nombre = leerEntradaUsuario.readLine();

            for (int i = 1; i <= 10; i++) {
                System.out.print("Examen " + i + ": ");
                nota = Integer.parseInt(leerEntradaUsuario.readLine());
                calificacion = calificacion + nota;
            }
            promedio = calificacion / 10;
            System.out.println(nombre + " tu promedio es de: " + promedio);
        } catch (IOException ex) {
            log.error("Error de IO", ex);
        }

    }

}
