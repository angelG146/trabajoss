import java.util.Scanner;

public class ValidarContrasenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseniaCorrecta = "java1234";
        String intento = "";

        while (!intento.equals(contraseniaCorrecta)) {
            System.out.print("Introduce la contraseña de acceso: ");
            intento = scanner.nextLine();

            if (!intento.equals(contraseniaCorrecta)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }
        }
        System.out.println("¡Acceso concedido!");
        scanner.close();
    }
}