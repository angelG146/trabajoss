import java.util.Scanner;

public class EvaluadorNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero > 0) {

            System.out.println("Positivo");

        } else if (numero < 0) {

            System.out.println("Negativo");

        } else {

            System.out.println("Cero");
        }

        if (numero % 2 == 0) {

            System.out.println("Par");

        } else {

            System.out.println("Impar");
        }

        if (numero % 3 == 0 && numero % 5 == 0) {

            System.out.println("Multiplo de 3 y 5");

        } else if (numero % 3 == 0) {

            System.out.println("Multiplo de 3");

        } else if (numero % 5 == 0) {

            System.out.println("Multiplo de 5");

        } else {

            System.out.println("No es multiplo de 3 ni de 5");
        }

        sc.close();
    }
}
