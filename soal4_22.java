import java.util.Scanner;

public class soal4_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input jumlah baris: ");
        int baris = scanner.nextInt();

        System.out.print("Input jumlah kolom: ");
        int kolom = scanner.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
