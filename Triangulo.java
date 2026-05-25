import java.util.Scanner;

public class Triangulo {
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

            System.out.println("Si forman triangulo");

            if (a == b && b == c) {
                System.out.println("Triangulo Equilatero");
            }

            if (a == b || a == c || b == c) {
                if (!(a == b && b == c)) {
                    System.out.println("Triangulo Isosceles");
                }
            }

            if (a != b && a != c && b != c) {
                System.out.println("Triangulo Escaleno");
            }

        }

        if (!(a + b > c && a + c > b && b + c > a)) {
            System.out.println("No forman triangulo");
        }

        sc.close();
    }
}
