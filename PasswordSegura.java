import java.util.Scanner;

public class PasswordSegura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password;

        boolean mayuscula = false;
        boolean numero = false;
        boolean simbolo = false;

        System.out.print("Ingrese contraseña: ");
        password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Debe tener minimo 8 caracteres.");
        }

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }

            if (Character.isDigit(c)) {
                numero = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                simbolo = true;
            }
        }

        if (!mayuscula) {
            System.out.println("Falta una mayuscula.");
        }

        if (!numero) {
            System.out.println("Falta un numero.");
        }

        if (!simbolo) {
            System.out.println("Falta un simbolo.");
        }

        if (password.length() >= 8 && mayuscula && numero && simbolo) {
            System.out.println("Contraseña segura.");
        }

        sc.close();
    }
}
