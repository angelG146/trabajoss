import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        int num;
        
        System.out.println("Ingresa números (introduce 0 para terminar):");
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break; 
            }
            if (num > 0) {
                contadorPositivos++;
            }
        }
        System.out.println("Cantidad de números positivos ingresados: " + contadorPositivos);
        scanner.close();
    }
}