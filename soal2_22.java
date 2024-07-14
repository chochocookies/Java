import java.util.Scanner;

public class soal2_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Input sebuah angka : ");
        int angka = scanner.nextInt();

        System.out.println("Angka yang dapat membagi " + angka + " tanpa sisa adalah");

        int i = 1;
        do {
            if (angka % i == 0) {
                System.out.print(i);
                if (i != angka) {
                    System.out.print(",");
                }
            }
            i++;
        } while (i <= angka);

        scanner.close(); // Menutup scanner
    }
}
