import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingrese lado 1: ");
        a = sc.nextDouble();

        System.out.print("Ingrese lado 2: ");
        b = sc.nextDouble();

        System.out.print("Ingrese lado 3: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {

                System.out.println("Triangulo Equilatero");

            } else if (a == b || a == c || b == c) {

                System.out.println("Triangulo Isosceles");

            } else {

                System.out.println("Triangulo Escaleno");
            }

        } else {

            System.out.println("No forma un triangulo valido.");
        }

        sc.close();
    }
}
