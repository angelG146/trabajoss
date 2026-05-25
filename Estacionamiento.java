import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo, horas;
        double tarifa = 0, total;

        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camion");

        System.out.print("Seleccione tipo de vehiculo: ");
        tipo = sc.nextInt();

        System.out.print("Ingrese horas: ");
        horas = sc.nextInt();

        switch (tipo) {

            case 1:
                tarifa = 3;
                break;

            case 2:
                tarifa = 5;
                break;

            case 3:
                tarifa = 10;
                break;

            default:
                System.out.println("Tipo invalido.");
                return;
        }

        if (horas > 0) {
            total = tarifa * horas;
            System.out.println("Total a pagar: S/ " + total);
        } else {
            System.out.println("Horas invalidas.");
        }

        sc.close();
    }
}
