import java.util.Scanner;

public class Transporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distancia;
        String tipoUsuario;
        String horario;
        double costo;

        System.out.print("Ingrese distancia en km: ");
        distancia = sc.nextDouble();

        System.out.print("Tipo de usuario (estudiante, adulto, adultoMayor): ");
        tipoUsuario = sc.next();

        System.out.print("Horario (normal/nocturno): ");
        horario = sc.next();

        costo = distancia * 2;

        if (tipoUsuario.equalsIgnoreCase("estudiante")) {

            costo = costo * 0.5;

        } else if (tipoUsuario.equalsIgnoreCase("adultoMayor")) {

            costo = costo * 0.7;
        }

        if (horario.equalsIgnoreCase("nocturno")) {

            costo += 5;
        }

        System.out.println("Costo total: S/ " + costo);

        sc.close();
    }
}
