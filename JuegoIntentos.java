import java.util.Scanner;

public class JuegoIntentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "java123";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese clave: ");
            String clave = sc.nextLine();

            if (clave.equals(claveCorrecta)) {
                System.out.println("Acceso concedido.");
                break;
            }

            System.out.println("Clave incorrecta.");
        }
    }
}
