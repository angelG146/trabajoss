import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        }

        if (numero < 0) {
            System.out.println("El numero es negativo");
        }

        if (numero == 0) {
            System.out.println("El numero es cero");
        }

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }

        if (numero % 2 != 0) {
            System.out.println("El numero es impar");
        }

        sc.close();
    }
}
