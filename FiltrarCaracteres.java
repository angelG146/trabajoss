import java.util.Scanner;

public class FiltrarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto mezclada con números: ");
        String texto = scanner.nextLine();

        System.out.print("Texto filtrado (sin números): ");
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Si el carácter es un dígito del '0' al '9', lo ignoramos
            if (Character.isDigit(c)) {
                continue; // Salta al siguiente carácter sin imprimir este
            }
            
            System.out.print(c);
        }
        System.out.println();
        scanner.close();
    }
}