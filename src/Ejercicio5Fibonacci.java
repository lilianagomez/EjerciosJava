
/**
 *
 * @author Lilianag
 */
public class Ejercicio5Fibonacci {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1, resultado;
        for (int i =0; i < 20; i++){
            resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + ": " + resultado);
            num1 = num2;
            num2 = resultado;
        }
    }
}
