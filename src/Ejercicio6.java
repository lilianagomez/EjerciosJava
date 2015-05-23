
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lilianag
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Properties ruta = new Properties();
        String lineasEscritas;
            FileInputStream rutaArchivo = null;
            BufferedReader leerEntradaUsuario = new BufferedReader(new InputStreamReader(System.in));
        try {
            rutaArchivo = new FileInputStream("D:\\DYALOGO\\CURSO_JAVA\\Calse1\\src\\RutaArchivo.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ruta.load(rutaArchivo);
            File Archivo = new File(ruta.getProperty("rutaArchivoTxt"), "prueba.txt");  
            FileWriter escribirArchivo = new FileWriter(Archivo);
            BufferedWriter nuevaLinea = new BufferedWriter(escribirArchivo);
            System.out.println("Por favor digite la información que desea guardar en el archivo");
            lineasEscritas = leerEntradaUsuario.readLine();
            nuevaLinea.write(lineasEscritas);
            nuevaLinea.close();
            System.out.println("Se ha guardado exitosamente la información digitada");   
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
