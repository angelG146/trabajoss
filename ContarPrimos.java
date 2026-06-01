import java.util.Scanner;

public class ContarPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el inicio del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingresa el fin del rango: ");
        int fin = scanner.nextInt();
        
        int contadorPrimos = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i < 2) continue; // Los números menores a 2 no son primos
            
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contadorPrimos++;
            }
        }

        System.out.println("Hay " + contadorPrimos + " números primos en el rango [" + inicio + ", " + fin + "].");
        scanner.close();
    }
}
