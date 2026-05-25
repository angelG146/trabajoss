import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu, opcion;

        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");

        System.out.print("Seleccione una opcion: ");
        menu = sc.nextInt();

        switch (menu) {

            case 1:
                System.out.println("1. Cafe - S/5");
                System.out.println("2. Sandwich - S/8");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Cafe seleccionado.");
                        break;

                    case 2:
                        System.out.println("Sandwich seleccionado.");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                }
                break;

            case 2:
                System.out.println("1. Pollo a la brasa - S/20");
                System.out.println("2. Lomo saltado - S/18");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Pollo a la brasa seleccionado.");
                        break;

                    case 2:
                        System.out.println("Lomo saltado seleccionado.");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                }
                break;

            case 3:
                System.out.println("1. Pizza - S/25");
                System.out.println("2. Hamburguesa - S/15");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Pizza seleccionada.");
                        break;

                    case 2:
                        System.out.println("Hamburguesa seleccionada.");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                }
                break;

            default:
                System.out.println("Menu invalido.");
        }

        sc.close();
    }
}
