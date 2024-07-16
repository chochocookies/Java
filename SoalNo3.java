import java.util.Scanner;

public class SoalNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Sebuah angka: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int i = 1;
        System.out.print("Output: ");
        do {
            sum += i;
            System.out.print(sum + " ");
            i++;
        } while (i <= n);
    }
}
