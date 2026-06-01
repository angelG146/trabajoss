import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double nota;

        System.out.println("Ingresa las notas (introduce -1 para calcular el promedio):");
        while (true) {
            nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            suma += nota;
            contador++;
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de las " + contador + " notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }
        scanner.close();
    }
}
