import java.util.Scanner;
/**
 * Tugas321
 */
public class Tugas321 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal harus 1!");
            }
            } while (jumlahToko < 1);

        int totalBarangSeluruh = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 1;

        int i = 1;
        while (i <= jumlahToko) {
            System.out.println(" Toko " + i );
            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            int j = 1;
            while (j <= jumlahPelanggan) {
                int jumlahBarang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
                j++;
            }
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalBarangSeluruh += totalBarangToko;
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }

            i++;
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}