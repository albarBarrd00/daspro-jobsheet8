import java.util.Scanner;
/**
 * Tugas121
 */
public class Tugas121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int angka = 1;
        
        int i = 1;

        while (i <= n){
            int j = 0;
            while (j < i) {
                angka = i;
                System.out.print(j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}