import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String claveCorrecta = "12345";

        String usuario, clave;

        int intentos = 0;

        while (intentos < 3) {

            System.out.print("Usuario: ");
            usuario = sc.next();

            System.out.print("Contraseña: ");
            clave = sc.next();

            if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {

                System.out.println("Inicio de sesion exitoso.");
                break;

            } else {

                intentos++;
                System.out.println("Datos incorrectos.");
            }
        }

        if (intentos == 3) {
            System.out.println("Cuenta bloqueada.");
        }

        sc.close();
    }
}