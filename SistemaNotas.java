import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, promedio;

        System.out.print("Ingrese nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        n2 = sc.nextDouble();

        System.out.print("Ingrese nota 3: ");
        n3 = sc.nextDouble();

        promedio = (n1 + n2 + n3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 11) {
            System.out.println("Aprobado");
        }

        if (promedio < 11 && promedio > 8) {
            System.out.println("Recuperacion");
        }

        if (promedio <= 8) {
            System.out.println("Desaprobado");
        }

        sc.close();
    }
}
