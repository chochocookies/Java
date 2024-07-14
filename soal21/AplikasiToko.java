import java.util.Scanner;

public class AplikasiToko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("APLIKASI TOKO");
        System.out.println(">>>>>>>>>>O<<<<<<<<<<");

        // Meminta input jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        String[] namaBarang = new String[jumlahBarang];
        int[] hargaBarang = new int[jumlahBarang];

        // Meminta input nama dan harga barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("---------------------------------------------------");
            System.out.println("Barang ke : " + (i + 1));
            System.out.print("Nama : ");
            namaBarang[i] = scanner.nextLine();
            System.out.print("Harga : ");
            hargaBarang[i] = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
        }

        // Menampilkan daftar belanja
        System.out.println("---------------------------------------------------");
        System.out.println("DAFTAR BELANJA");
        System.out.println("=================");
        System.out.println("No\tNama\t\t\tHarga");

        int totalHarga = 0;

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("%d\t%s\t\t\t%d\n", (i + 1), namaBarang[i], hargaBarang[i]);
            totalHarga += hargaBarang[i];
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Jadi total harga yang harus dibayar : Rp " + totalHarga);

        scanner.close();
    }
}
