public class NestedForWithIfPattern {
    public static void main(String[] args) {
        int rows = 3; // Jumlah baris
        int cols = 5; // Jumlah kolom

        for (int i = 0; i < rows; i++) { // Loop untuk baris
            for (int j = 0; j < cols; j++) { // Loop untuk kolom
                if (i == 1 && (j == 2 || j == 3)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
