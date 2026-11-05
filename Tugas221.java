import java.util.Scanner;
/**
 * Tugas221
 */
public class Tugas221 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int angka = 1;
        int tot = 0; 
        

        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int hasil = i * j;
                System.out.printf("%4d" , hasil );
                tot += hasil;
                j++;
               
            }
            System.out.println();
            i++;
        }
        System.out.println("Jumlah seluruh angka: " + tot);
        sc.close();
    }
}