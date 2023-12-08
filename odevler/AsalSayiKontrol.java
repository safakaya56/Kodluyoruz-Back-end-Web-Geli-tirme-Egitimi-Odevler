package odevler;

import java.util.Scanner;

public class AsalSayiKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Asallik kontrolü için sayınızı girin: ");
        int sayi = input.nextInt();

        int sonuc = asalKontrol(sayi, sayi / 2);

        if (sonuc == 1) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal sayı değildir.");
        }
    }

    public static int asalKontrol(int sayi, int i) {
        if (i == 1) {
            return 1;
        }

        else {

            if (sayi % i == 0) {
                return 0;
            }

            else {
                return asalKontrol(sayi, i - 1);
            }
        }
    }
}
