import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine().toLowerCase(); // Lo pasamos a minúsculas para facilitar el chequeo

        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("El texto contiene " + contadorVocales + " vocales.");
        scanner.close();
    }
}
