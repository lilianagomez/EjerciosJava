import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

/**
 *
 * @author Lilianag
 */
public class Ejercicio4 {

    static Logger log = Logger.getLogger(Ejercicio1.class.getName());
    
    public static void main(String[] args) throws IOException {
        String frase;
        boolean error;
        int numIngresado, salePrograma = 1;

        BufferedReader leerEntradaUsuario = new BufferedReader(new InputStreamReader(System.in));
        do{
            error = false;
        try {
            System.out.println("Por favor digite un número");
            numIngresado = Integer.parseInt(leerEntradaUsuario.readLine());

            if (numIngresado < 1 | numIngresado > 10) {
                System.out.println("Usted ingresó un numero incorrecto, este debe estar entre 1 y 10");
            }else{
                switch (numIngresado){
                    case 1:
                        System.out.println("Usted ingresó el número 1");
                        break;
                    case 2:
                        System.out.println("Usted ingresó el número 2");
                        break;
                    case 3:
                        System.out.println("Usted ingresó el número 3");
                        break;
                    case 4:
                        System.out.println("Usted ingresó el número 4");
                        break;
                    case 5:
                        System.out.println("Usted ingresó el número 5");
                        break;
                    default:
                        System.out.println("Usted ingresó un número mayor a 5");
                        break;
                }
            }
            System.out.println("Si desea salir del programa por favor digite el número 0");
            salePrograma = Integer.parseInt(leerEntradaUsuario.readLine());
            if (salePrograma == 0){
                error = false;
            }else{
                error = true;
            }
        } catch (IOException ex) {
            log.error("Error de IO", ex);
            System.out.println("Se generó una excepción, si desea salir del programa por favor digite el número 0");
            salePrograma = Integer.parseInt(leerEntradaUsuario.readLine());
            if (salePrograma == 0){
                error = false;
            }else{
                error = true;
            }
        }catch (NumberFormatException ne){
            log.error("Error de conversión", ne);
            System.out.println("Usted no digitó un número, si desea salir del programa por favor digite el número 0");
            salePrograma = Integer.parseInt(leerEntradaUsuario.readLine());
            if (salePrograma == 0){
                error = false;
            }else{
                error = true;
            }
        }
        }while(error);
    }

}
