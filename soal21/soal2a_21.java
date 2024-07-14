public class soal2a_21 {
    public static void main(String[] args) {
        int rows = 5; // Jumlah baris
        int number = 1; // Angka yang akan dicetak

        for (int i = 1; i <= rows; i++) { // Loop untuk baris
            for (int j = 1; j <= i; j++) { // Loop untuk kolom di setiap baris
                if (true) { // Struktur if, kondisi selalu benar
                    System.out.print(number + " ");
                    number++; // Naikkan angka
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
