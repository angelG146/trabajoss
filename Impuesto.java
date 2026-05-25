import java.util.Scanner;

public class Impuesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ingreso;
        double impuesto;

        System.out.print("Ingrese ingreso: ");
        ingreso = sc.nextDouble();

        if (ingreso < 0) {

            System.out.println("Ingreso invalido.");

        } else if (ingreso <= 1000) {

            impuesto = ingreso * 0.05;
            System.out.println("Impuesto: S/ " + impuesto);

        } else if (ingreso <= 5000) {

            impuesto = ingreso * 0.10;
            System.out.println("Impuesto: S/ " + impuesto);

        } else {

            impuesto = ingreso * 0.20;
            System.out.println("Impuesto: S/ " + impuesto);
        }

        sc.close();
    }
}
