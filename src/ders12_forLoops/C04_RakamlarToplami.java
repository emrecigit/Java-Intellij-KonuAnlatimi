package ders12_forLoops;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanıcının verdiği sayının rakamlar toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Sayı giriniz : ");
        int sayi=scan.nextInt();
        int toplam=0;
        int kalan=0;
        String sayiStr=""+sayi;


        for (int i = 1; i <=sayiStr.length() ; i++) {
            kalan=sayi%10;
            sayi=sayi/10;
            toplam+=kalan;

        }
        System.out.println("Rakamlar Toplamı : "+ toplam);
    }
}
