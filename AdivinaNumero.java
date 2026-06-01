import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;

        System.out.println("¡Adivina el número secreto entre 1 y 100!");

        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es MENOR.");
            }
        }
        System.out.println("¡Felicidades! Has adivinado el número.");
        scanner.close();
    }
}
