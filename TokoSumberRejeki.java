public class TokoSumberRejeki {
    public static void main(String[] args) {
        // Menampilkan informasi toko
        System.out.println("TOKO SUMBER REJEKI");
        System.out.println("Jalan In Aja Dulu No 11");
        System.out.println("Kec Pelaminan, Jakarta Tengah");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Nama Barang\tQty\tHarga\tTotal");
        System.out.println("-----------------------------------------------------------------------");
        
        // Menampilkan daftar barang dan detail transaksi
        String[] namaBarang = {"Luwak Black Coffe", "Pop Mie LikinMu"};
        int[] qty = {10, 5};
        int[] harga = {9000, 5000};
        
        int subtotal = 0;
        for (int i = 0; i < namaBarang.length; i++) {
            int total = qty[i] * harga[i];
            System.out.println(namaBarang[i] + "\t" + qty[i] + "\t" + harga[i] + "\t" + total);
            subtotal += total;
        }
        
        // Menghitung total dan ppn
        double ppn = subtotal * 0.1;
        int totalQty = 0;
        for (int q : qty) {
            totalQty += q;
        }
        int total = subtotal + (int) ppn;
        
        // Menampilkan subtotal, ppn, total qty, dan total
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Subtotal \t= " + subtotal);
        System.out.println("Ppn (10%)\t= " + (int) ppn);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Total Qty\t= " + totalQty);
        System.out.println("Total\t\t= " + total);
        System.out.println("===========================================");
        System.out.println("Barang yang sudah di beli");
        System.out.println("Tidak dapat DITUKAR atau DIKEMBALIKAN");
        System.out.println("------------------------ Terima Kasih ----------------------------");
    }
}
