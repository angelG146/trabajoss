import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        double a, b, resultado;

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");

        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();

        System.out.print("Ingrese dos numeros: ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        switch (opcion) {

            case 1:
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Error: division por cero.");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5:
                resultado = Math.pow(a, b);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Entrada invalida.");
        }

        sc.close();
    }
}