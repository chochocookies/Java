import java.util.Scanner;

public class SoalNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input angka terakhir NPM anda: ");
        int npm = scanner.nextInt();
        int ab = 13 * npm / 13;

        for (ab = 10; ab <= 12; ab++) {
            while (ab < npm) {
                System.out.println("NPM: " + npm);
                npm += ab;
            }
            do {
                npm--;
                System.out.println("Nilai AB = " + ab);
            } while (ab < 5);
        }

        System.out.println("Nilai AB terakhir = " + ab);
        System.out.println("Nilai NPM terakhir = " + npm);

        scanner.close(); // Menutup scanner
    }
}
