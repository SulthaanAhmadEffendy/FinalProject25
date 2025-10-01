package praktikumdaspro3;

import java.util.Scanner;

public class sewamobil {

    public static void main(String[] args) {

        // input lama sewa dalam hari dan jarak tempuh dalam km
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan lama sewa (dalam hari): ");
        int lamaSewa = scanner.nextInt();
        System.out.println("Masukkan jarak tempuh (dalam km): ");
        int jarakTempuh = scanner.nextInt();

        // biaya sewa mobil per hari 300000
        // biaya sopir per hari 200000
        // biaya bbm 1000 per km
        // menghitung total biaya sewa mobil berdasarkan lama sewa dan jarak tempuh
        int biayaBbm = 1000 * jarakTempuh; 
        int tarifPerHari = 300000; 
        int biayaSopir = 200000 * lamaSewa;
        int totalBiaya = (tarifPerHari * lamaSewa) + biayaBbm + biayaSopir;

        //output total biaya sewa mobil
        System.out.printf("Total biaya sewa mobil: Rp %,d%n", totalBiaya);
    }
    
}
