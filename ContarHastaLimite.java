public class ContarHastaLimite {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 20; i++) {
            suma += i;

            if (suma > 50) {
                System.out.println("Límite superado.");
                break;
            }

            System.out.println("Número: " + i + " Suma: " + suma);
        }
    }
}
