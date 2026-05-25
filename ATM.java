import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pinCorrecto = 1234;
        int pin;
        int intentos = 0;

        double saldo = 2000;
        double limiteDiario = 1000;
        double retiro;

        while (intentos < 3) {

            System.out.print("Ingrese PIN: ");
            pin = sc.nextInt();

            if (pin == pinCorrecto) {

                System.out.println("PIN correcto");
                System.out.println("Saldo actual: S/ " + saldo);

                System.out.print("Ingrese monto a retirar: ");
                retiro = sc.nextDouble();

                if (retiro > limiteDiario) {
                    System.out.println("Supera el limite diario.");
                } else if (retiro > saldo) {
                    System.out.println("Fondos insuficientes.");
                } else if (retiro <= 0) {
                    System.out.println("Monto invalido.");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso.");
                    System.out.println("Nuevo saldo: S/ " + saldo);
                }

                break;

            } else {
                intentos++;
                System.out.println("PIN incorrecto.");
            }
        }

        if (intentos == 3) {
            System.out.println("Cuenta bloqueada.");
        }

        sc.close();
    }
}