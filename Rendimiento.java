import java.util.Scanner;

public class Rendimiento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int puntualidad, productividad, cumplimiento;
        int promedio;

        System.out.print("Puntualidad (0-20): ");
        puntualidad = sc.nextInt();

        System.out.print("Productividad (0-20): ");
        productividad = sc.nextInt();

        System.out.print("Cumplimiento (0-20): ");
        cumplimiento = sc.nextInt();

        promedio = (puntualidad + productividad + cumplimiento) / 3;

        if (promedio >= 18) {

            System.out.println("Excelente");

        } else if (promedio >= 14) {

            System.out.println("Bueno");

        } else if (promedio >= 10) {

            System.out.println("Regular");

        } else {

            System.out.println("Deficiente");
        }

        sc.close();
    }
}