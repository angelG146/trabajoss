public class PrimerMultiplo {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Primer múltiplo de 7: " + i);
                break;
            }
        }
    }
}
