import java.util.Scanner;

public class AccesoSistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuario;
        int contraseña;

        System.out.print("Ingrese usuario: ");
        usuario = sc.next();

        System.out.print("Ingrese contraseña: ");
        contraseña = sc.nextInt();

        if (usuario.equals("admin") && contraseña == 1234) {
            System.out.println("Acceso correcto");
        }

        if (!usuario.equals("admin") || contraseña != 1234) {
            System.out.println("Acceso denegado");
        }

        sc.close();
    }
}
