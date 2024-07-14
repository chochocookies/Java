import java.util.Scanner;

public class soal1_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Inputan sebuah angka : ");
        int angka = scanner.nextInt();

        // Menampilkan hasil bagi dan sisa bagi
        System.out.println("==========================");

        int i = 1;
        while (i <= 10) {
            int hasilBagi = angka / i;
            int sisaBagi = angka % i;
            System.out.printf("%d : %d = %d sisa %d\n", angka, i, hasilBagi, sisaBagi);
            i++;
        }

        scanner.close(); // Menutup scanner
    }
}
