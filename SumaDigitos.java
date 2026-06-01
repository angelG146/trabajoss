import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = Math.abs(scanner.nextInt()); 
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10; // Extrae el último dígito
            numero /= 10;        // Elimina el último dígito
        }
        System.out.println("La suma de los dígitos es: " + suma);
        scanner.close();
    }
}