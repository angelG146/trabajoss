import java.util.Scanner;

public class MayorMenorArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos elementos tendrá el arreglo?: ");
        int tamano = scanner.nextInt();

        int[] numeros = new int[tamano];

        // Llenar el arreglo
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        // Buscar mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número MAYOR es: " + mayor);
        System.out.println("El número MENOR es: " + menor);
        scanner.close();
    }
}
