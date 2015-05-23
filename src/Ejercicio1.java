import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

/**
 *
 * @author Lilianag
 */
public class Ejercicio1 {

    static Logger log = Logger.getLogger(Ejercicio1.class.getName());

    public static void main(String[] args) {

        BufferedReader leerEntradaUsuario = new BufferedReader(new InputStreamReader(System.in));
        String nombre, categoria = null;
        boolean error = false;
        int edad, edadMasDiez;

        do {
            error = false;
            try {
                System.out.println("Digite su nombre");
                nombre = leerEntradaUsuario.readLine();

                System.out.println("Digite su edad");
                edad = Integer.parseInt(leerEntradaUsuario.readLine());

                if (edad >= 0 & edad <= 25) {
                    categoria = "A";
                } else {
                    if (edad >= 26 & edad <= 50) {
                        categoria = "B";
                    } else {
                        if (edad >= 51) {
                            categoria = "C";
                        }
                    }
                }
                edadMasDiez = edad + 10;

                System.out.println("Usuario " + nombre + " de categoria " + categoria + ", en una década tendrá " + edadMasDiez + " años");
            } catch (IOException ex) {
                //Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
                log.error("Error de IO", ex);
                error = true;
            } catch (NullPointerException ex) {
                System.out.println("Usted no digitó nada");
                error = true;
            } catch (NumberFormatException ne) {
                log.error("Eror de Conversión", ne);
                ne.printStackTrace(System.err);
                System.out.println("Usted no digitó un número");
                error = true;
            }
        } while (error);
    }
}
