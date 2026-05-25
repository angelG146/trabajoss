import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rol;

        System.out.print("Ingrese rol (ADMIN, USER, GUEST): ");
        rol = sc.next().toUpperCase();

        switch (rol) {

            case "ADMIN":
                System.out.println("ADMIN -> Acceso total");
                break;

            case "USER":
                System.out.println("USER -> Acceso parcial");
                break;

            case "GUEST":
                System.out.println("GUEST -> Solo lectura");
                break;

            default:
                System.out.println("Rol invalido.");
        }

        sc.close();
    }
}