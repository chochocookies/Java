public class NestedForPattern {
    public static void main(String[] args) {
        int rows = 5; // Jumlah baris untuk setengah bagian pertama

        // Bagian pertama: segitiga kanan ke atas
        for (int i = 1; i <= rows; i++) { // Loop untuk baris
            for (int j = rows; j > i; j--) { // Loop untuk spasi
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) { // Loop untuk bintang
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }

        // Bagian kedua: segitiga kanan ke bawah
        for (int i = rows; i >= 1; i--) { // Loop untuk baris
            for (int j = rows; j > i; j--) { // Loop untuk spasi
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) { // Loop untuk bintang
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}

// output
// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *
