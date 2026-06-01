import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos términos de la serie de Fibonacci deseas ver?: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        int contador = 0;

        System.out.print("Serie: ");
        while (contador < n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }
        System.out.println();
        scanner.close();
    }
}