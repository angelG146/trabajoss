import java.util.Scanner;

public class CategoriaEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Niño");
        }

        if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        }

        if (edad >= 18 && edad <= 64) {
            System.out.println("Adulto");
        }

        if (edad >= 65) {
            System.out.println("Adulto mayor");
        }

        sc.close();
    }
}
