import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int año;

        System.out.print("Ingrese un año: ");
        año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Es un año bisiesto");
        }

        if (!((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("No es un año bisiesto");
        }

        sc.close();
    }
}
