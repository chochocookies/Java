import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan banyaknya perulangan yang diinginkan = ");
        int n = scanner.nextInt();

        System.out.println("==========================================");

        // Loop untuk mencari bilangan yang sesuai kriteria
        for (int i = 1; i <= n; i++) {
            int number = i * 3 * 5; // Bilangan yang selalu habis dibagi 3 dan 5

            // Cek apakah bilangan tersebut tidak habis dibagi 2
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        scanner.close(); // Menutup scanner
    }
}
