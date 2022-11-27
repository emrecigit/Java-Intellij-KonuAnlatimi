package ders11_StringManipulation;

import java.util.Scanner;

public class C08_Soru {
    public static void main(String[] args) {
        /*Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen şifre giriniz : ");
        String sifre = scan.nextLine();
        char sonHarf = sifre.charAt(sifre.length() - 1);
        int sayac=4;

        if (sifre.length() >= 10) {
            System.out.println("Şifre uzunluğu gereksınımlerı karsılamıyor");
            sayac--;
        }
        if (!sifre.substring(0, 1).equals("a")) {
            System.out.println("şifre baş harfi küçük olmalı !");
            sayac--;
        }
        if (!Character.isDigit(sonHarf)) {
            System.out.println("Son karakter rakam olmalı !");
            sayac--;
        }
        if(sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            sayac--;
        }
        if (sayac==4){

            System.out.println("Şifre başarı ile kaydedildi !");
        }
    }

}

