import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        int decimal = scanner.nextInt();
        
        if (decimal == 0) {
            System.out.println("El número en binario es: 0");
            scanner.close();
            return;
        }

        String binario = "";
        int temp = decimal;

        while (temp > 0) {
            int residuo = temp % 2;
            binario = residuo + binario; // Lo añade a la izquierda para voltear el resultado
            temp /= 2;
        }
        System.out.println("El número " + decimal + " en binario es: " + binario);
        scanner.close();
    }
}
