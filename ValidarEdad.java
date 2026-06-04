import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        while (true) {
            System.out.print("Ingrese edad: ");
            edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("Edad inválida.");
                continue;
            }

            System.out.println("Edad válida.");
            break;
        }
    }
}
