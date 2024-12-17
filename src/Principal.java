
import java.util.Scanner;

/*
 * Secuencia Fibonacci Dinámico en Java
 * Por Esdras Perez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 1, c = 0,numero;

        System.out.print("Ingresa la cantidad a contar con Fibonacci: ");
        numero = entrada.nextInt();
        
        while (a <= numero) {
            if (c == 0) {
                System.out.print(a + ", ");
            } else {
                System.out.print(c + ", ");
            }
            c = a + b;
            b = a;
            a = c;
        }
        System.out.println("");
    }
}
