import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        long factorial = 1; // Usamos long para soportar números grandes

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " con bucle FOR es: " + factorial);
        scanner.close();
    }
}
