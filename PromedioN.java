import java.util.Scanner;

public class PromedioN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a ingresar?: ");
        int n = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el valor #" + i + ": ");
            suma += scanner.nextDouble();
        }

        if (n > 0) {
            double promedio = suma / n;
            System.out.println("El promedio total es: " + promedio);
        } else {
            System.out.println("Cantidad de valores no válida.");
        }
        scanner.close();
    }
}
