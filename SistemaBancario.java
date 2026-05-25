import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        double saldo = 1000;
        double monto;

        do {
            System.out.println("\n=== MENU BANCARIO ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese monto a depositar: ");
                    monto = sc.nextDouble();

                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Deposito exitoso.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    monto = sc.nextDouble();

                    if (monto <= 0) {
                        System.out.println("Monto invalido.");
                    } else if (monto > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= monto;
                        System.out.println("Retiro exitoso.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo actual: S/ " + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}