import java.util.Scanner;

public class OperacionesLogicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String operador;
        boolean a, b, resultado;

        System.out.print("Ingrese operador (AND, OR, XOR): ");
        operador = sc.next().toUpperCase();

        System.out.print("Ingrese primer valor booleano (true/false): ");
        a = sc.nextBoolean();

        System.out.print("Ingrese segundo valor booleano (true/false): ");
        b = sc.nextBoolean();

        switch (operador) {

            case "AND":
                resultado = a && b;
                System.out.println("Resultado: " + resultado);
                break;

            case "OR":
                resultado = a || b;
                System.out.println("Resultado: " + resultado);
                break;

            case "XOR":
                resultado = a ^ b;
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Operador invalido.");
        }

        sc.close();
    }
}
