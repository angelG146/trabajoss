import java.util.Scanner;

public class IgnorarPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Número negativo encontrado.");
                break;
            }
        }
    }
}
