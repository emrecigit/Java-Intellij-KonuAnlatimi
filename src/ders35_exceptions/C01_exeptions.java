package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exeptions {
    public static void main(String[] args) {
        /*Kullanıcıdan bir tam sayı alıp ve sayının karesini yazdıran.
     kullanıcı ondalıklı sayı girerse kullanıcıya uyarı verip yazdırıp tekrar sayı isteyn bir method olusturun.*/

       sayiAlKaresiniYazdir();
    }
    public static void sayiAlKaresiniYazdir(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz :");

        int girilenSayi= 0;
        try {
            girilenSayi = scan.nextInt();
            /*
            Eger onlıklı sayı gırılırse 20. satır exception verecek ve catch bloguna kadar olan dıger kodlar calısmayacak
            catch blogu hata yakalandıgında ne yapmasını ıstedıgımızı soyledıgımız bolumdur

            bu soruda ıstenen exceptıon olustufgnda yenıden deger ıstenmesı
            bız de exceptıon olustugunda yenıden method'u calıstırdık

            hata olmaz ıse catch blogu devreye gırmez ve kod normal bır sekılde biter.
             */
            System.out.println("Girdiğiniz sayının karesi");
            System.out.println(girilenSayi*girilenSayi);
        } catch (InputMismatchException e) {
            System.out.println("Sana tamsayı değeri gir dedik :) ");
            sayiAlKaresiniYazdir();
        }



    }
}
