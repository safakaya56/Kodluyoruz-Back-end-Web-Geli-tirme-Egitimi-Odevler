package odevler;

import java.util.Scanner;

public class sıralama {

    static void enBuyukKucuk(int[] dizi, int n) {
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {

                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        int enBuyuk = dizi[0];
        int enKucuk = dizi[dizi.length - 1];

        System.out.println("en buyuk eleman: " + enBuyuk);
        System.out.println();
        System.out.println("en kucuk eleman: " + enKucuk);
        System.out.println("--dizinin siralanmis hali--");
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }

    }

}

class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sıralama Sıralama = new sıralama();

        int n;
        System.out.print("lutfen girmek istediginiz eleman sayisini girin: ");
        n = input.nextInt();
        int[] dizi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("lutfen elaman girin: ");

            dizi[i] = input.nextInt();
        }

        Sıralama.enBuyukKucuk(dizi, n);
    }

}