import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de la base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Ingresa el exponente máximo (n): ");
        int n = scanner.nextInt();

        double suma = 1.0; // El primer término es 1

        for (int i = 1; i <= n; i++) {
            suma += Math.pow(x, i);
        }

        System.out.println("El resultado de la serie exponencial es: " + suma);
        scanner.close();
    }
}
