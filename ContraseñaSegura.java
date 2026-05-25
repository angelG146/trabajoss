import java.util.Scanner;

public class ContraseñaSegura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contraseña;

        System.out.print("Ingrese contraseña numerica: ");
        contraseña = sc.nextInt();

        if (contraseña > 1000 && contraseña < 9999) {
            System.out.println("Contraseña valida");
        }

        if (!(contraseña > 1000 && contraseña < 9999)) {
            System.out.println("Contraseña invalida");
        }

        sc.close();
    }
}