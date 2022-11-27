package ders13_nestedForLoop_methocOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan 2 sayı alıp, bunların toplamını yazdıran bir method olusturun.

        toplam();
    }
    public static void toplam(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        int ilkSayi= scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz :");
        int ikinciSayi= scan.nextInt();
        System.out.println("Girilen sayıların toplamı : "+(ikinciSayi+ilkSayi));
    }
}
