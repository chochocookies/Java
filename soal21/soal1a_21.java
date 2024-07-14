public class soal1a_21 {
    public static void main(String[] args) {
        // Loop untuk baris
        for (int i = 1; i <= 5; i++) {
            // Loop untuk kolom
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
