package odevler;

import java.util.Scanner;

public class biletFiyat {

    static void hesaplama(int mesafe, int yas, int gidisYonu) {

        int biletFiyati = (int) (mesafe * 0.10);

        if (yas < 12) {

            biletFiyati -= (biletFiyati * 0.5);
        }

        else if (yas >= 12 && yas < 24) {

            biletFiyati -= (biletFiyati * 0.1);

        }

        else if (yas >= 65) {
            biletFiyati -= (biletFiyati * 0.3);

        }

        if (gidisYonu == 2) {
            biletFiyati -= (biletFiyati * 0.2);

        }

        System.out.println("bilet fiyatiniz " + biletFiyati + " tl olarak hesaplanmistir.");
    }

}

class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        biletFiyat BiletFiyat = new biletFiyat();

        int mesafe = 0, yas = 0, gidisYonu = 0;

        System.out.print("lutfen mesafeyi giriniz: ");
        mesafe = input.nextInt();
        if (mesafe <= 0) {
            System.out.println("Hatali giris!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("lutfen yasınızı giriniz: ");
        yas = input.nextInt();
        if (mesafe <= 0) {
            System.out.println("Hatali giris!");
            System.exit(0);
        }

        System.out.println();

        System.out.print("Lütfen gidis yonunuzu 1(tek yon) veya 2(cift yon) olarak girin: ");
        gidisYonu = input.nextInt();
        if (gidisYonu != 1 && gidisYonu != 2) {
            System.out.println("Hatali giris!");
            System.exit(0);
        }

        BiletFiyat.hesaplama(mesafe, yas, gidisYonu);

    }

}