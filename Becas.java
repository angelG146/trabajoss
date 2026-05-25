import java.util.Scanner;

public class Becas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double promedio;
        boolean ingresosBajos;
        int cursosDesaprobados;

        System.out.print("Ingrese promedio: ");
        promedio = sc.nextDouble();

        System.out.print("¿Ingresos familiares bajos? (true/false): ");
        ingresosBajos = sc.nextBoolean();

        System.out.print("Ingrese cursos desaprobados: ");
        cursosDesaprobados = sc.nextInt();

        if (promedio >= 16) {

            if (ingresosBajos && cursosDesaprobados <= 1) {
                System.out.println("Beca completa");
            } else if (cursosDesaprobados <= 2) {
                System.out.println("Beca parcial");
            } else {
                System.out.println("No recibe beca");
            }

        } else {
            System.out.println("No cumple promedio minimo");
        }

        sc.close();
    }
}
