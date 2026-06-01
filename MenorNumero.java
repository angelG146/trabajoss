import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa números (introduce 0 para terminar):");
        int num = scanner.nextInt();
        
        if (num == 0) {
            System.out.println("No ingresaste ningún número antes del cero.");
            scanner.close();
            return;
        }

        int menor = num; 

        while (num != 0) {
            if (num < menor) {
                menor = num;
            }
            num = scanner.nextInt();
        }
        System.out.println("El menor número ingresado fue: " + menor);
        scanner.close();
    }
}
