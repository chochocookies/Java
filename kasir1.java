public class kasir1 {
    public static void main(String[] args) {
        String nm_toko = "TOKO MENU A";
        String alamat1 = "Jalan In Aja Dulu";
        String alamat2 = "Ke Pelamin A, Jakarta Tengah";

        String nm_brg1 = "Luwak Black Coffe";
        int qty1 = 10;
        int hrg1 = 9200;

        String nm_brg2 = "Pop Mie Likin Mu";
        int qty2 = 5;
        int hrg2 = 4000;

        int total_hrg1 = qty1 * hrg1;       
        int total_hrg2 = qty2 * hrg2;
        
        int subtotal = total_hrg1 + total_hrg2;
        double ppn = 0.1 * subtotal;
        int total_qty = qty1 + qty2;
        double total = subtotal - ppn;

        System.out.println(nm_toko);
        System.out.println(alamat1);
        System.out.println(alamat2);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nama Barang" + "\t\t" + "Qty" + "\t\t" + "Harga" + "\t\t" + "Total");
        System.out.println("----------------------------------------------------------------");
        System.out.println(nm_brg1 + "\t" + qty1 + "\t" + hrg1 + "\t\t" + total_hrg1);
        System.out.println(nm_brg2 + "\t" + qty2 + "\t" + hrg2 + "\t\t" + total_hrg2);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Subtotal = " + subtotal);
        System.out.println("Ppn (10%) = " + Math.round(total));
        System.out.println("================================================================");
        System.out.println();
        System.out.println("Barang yang sudah dibeli");
        System.out.println("Tidak dapat DITUKAR atau DIKEMBALIKAN");
        System.out.println();
        System.out.println("------------------------- Terima Kasih -------------------------");
    }
}
