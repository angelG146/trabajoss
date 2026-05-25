import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double compra, descuento, total;
        String tipoCliente;

        System.out.print("Ingrese monto de compra: ");
        compra = sc.nextDouble();

        System.out.print("Ingrese tipo de cliente (VIP o NORMAL): ");
        tipoCliente = sc.next();

        descuento = 0;

        if (compra > 500 && tipoCliente.equalsIgnoreCase("VIP")) {
            descuento = compra * 0.20;
        }

        if (compra > 500 && !tipoCliente.equalsIgnoreCase("VIP")) {
            descuento = compra * 0.10;
        }

        total = compra - descuento;

        System.out.println("Descuento: S/ " + descuento);
        System.out.println("Total a pagar: S/ " + total);

        sc.close();
    }
}
