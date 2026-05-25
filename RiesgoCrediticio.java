import java.util.Scanner;

public class RiesgoCrediticio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ingreso;
        String historial;
        int edad;

        System.out.print("Ingrese ingreso mensual: ");
        ingreso = sc.nextDouble();

        System.out.print("Ingrese historial crediticio (bueno, regular, malo): ");
        historial = sc.next().toLowerCase();

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

        if (ingreso >= 3000 && historial.equals("bueno") && edad >= 25) {
            System.out.println("Riesgo Bajo");
        } else if (ingreso >= 1500 && historial.equals("regular")) {
            System.out.println("Riesgo Medio");
        } else {
            System.out.println("Riesgo Alto");
        }

        sc.close();
    }
}
