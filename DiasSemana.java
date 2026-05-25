import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.print("Ingrese numero del dia (1-7): ");
        dia = sc.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Lunes - Laborable");
                break;

            case 2:
                System.out.println("Martes - Laborable");
                break;

            case 3:
                System.out.println("Miercoles - Laborable");
                break;

            case 4:
                System.out.println("Jueves - Laborable");
                break;

            case 5:
                System.out.println("Viernes - Laborable");
                break;

            case 6:
            case 7:
                if (dia == 6) {
                    System.out.println("Sabado - Fin de semana");
                } else {
                    System.out.println("Domingo - Fin de semana");
                }
                break;

            default:
                System.out.println("Numero invalido.");
        }

        sc.close();
    }
}