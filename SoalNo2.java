import java.util.Scanner;

public class SoalNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Input sebuah angka: ");
        int angka = scanner.nextInt();

        System.out.print("Output: ");

        int i = 1; // Mulai dari 1

        // Loop menggunakan while
        while (i <= angka) {
            if (angka % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        scanner.close(); // Menutup scanner
    }
}
