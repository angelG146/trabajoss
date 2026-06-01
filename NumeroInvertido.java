import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero para invertir: ");
        int numero = scanner.nextInt();
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = (invertido * 10) + digito;
            numero /= 10;
        }
        System.out.println("Número invertido: " + invertido);
        scanner.close();
    }
}
