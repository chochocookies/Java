import java.util.Scanner;

public class soal3_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Input batasan angka: ");
        int batas = scanner.nextInt();

        System.out.println("===========================");
        System.out.print("Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari " + batas + " adalah: ");

        int countGenap = 0;
        int countGanjil = 0;

        // Loop untuk mencari angka yang merupakan kelipatan 3 atau 5
        for (int i = 1; i < batas; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    countGenap++;
                } else {
                    countGanjil++;
                }
            }
        }

        // Menampilkan jumlah angka ganjil dan genap
        System.out.println("\nJumlah angka genap: " + countGenap + " angka");
        System.out.println("Jumlah angka ganjil: " + countGanjil + " angka");

        scanner.close(); // Menutup scanner
    }
}
