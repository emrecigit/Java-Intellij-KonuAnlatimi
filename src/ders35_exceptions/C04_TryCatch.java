package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {
        /* Kullanıcıdan istedğişi kadar sayı girmesini isteyip
            Girilen sayıları toplayın
            kullanıcının işlemi bitirmek için Q'ya basmasını isteyin Q'ya basıldığında
            toplam kaç sayı girdiğini  ve bu sayıların toplamının kac  oldugunu yazdırın
         */

        Scanner scan = new Scanner(System.in);
        double girilenSayi = 0;
        double sayilarinToplami = 0;
        int sayac = 0;
        boolean devam = true;

        while (devam) {
            System.out.println("Toplamak üzere sayı giriniz . \nBitirmek için Q'ya basınız ");

            try {
                girilenSayi = scan.nextDouble();
                sayilarinToplami += girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {

                String hata = scan.nextLine();
                if (hata.equalsIgnoreCase("q")) {

                    break;
                }
                else {
                    System.out.println("Bitirmek için q'ya bas dedik ");
                }
            }


        }
        System.out.println("Girilen sayaç adet sayının toplamı : " + sayilarinToplami);
    }

}