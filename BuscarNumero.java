import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 8, 12, 20, 30};

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        for (int num : numeros) {
            if (num == buscar) {
                System.out.println("Encontrado.");
                break;
            }
        }
    }
}
