import java.util.Scanner;

public class SoalNo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah baris: ");
        int n = scanner.nextInt();
        
        int num = 1;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    num++;
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
