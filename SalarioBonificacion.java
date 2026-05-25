import java.util.Scanner;

public class SalarioBonificacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario;
        int años;

        System.out.print("Ingrese salario: ");
        salario = sc.nextDouble();

        System.out.print("Ingrese años de trabajo: ");
        años = sc.nextInt();

        if (años > 5 && salario < 2000) {
            System.out.println("Recibe bono alto");
        }

        if ((años > 5 && salario >= 2000) || (años <= 5 && salario < 2000)) {
            System.out.println("Recibe bono menor");
        }

        if (años <= 5 && salario >= 2000) {
            System.out.println("No recibe bono");
        }

        sc.close();
    }
}
