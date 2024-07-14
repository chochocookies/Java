import java.util.Scanner;

public class soal5_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[5];

        // Input angka ke dalam array
        for (int i = 0; i < 5; i++) {
            System.out.print("Input bilangan ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        // Tampilkan isi array
        System.out.println("=========================");
        System.out.print("Data yang di input adalah : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
