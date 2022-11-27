package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {
        // main method içerisinde kullanıcıdan iki sayı alın
        // bu ıkı sayıyı parametre kabul edip carpımlarını bıze donduren
        // bir method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen iki değer giriniz : ");
        int deger=scan.nextInt();
        int deger2= scan.nextInt();
        System.out.println("Değerler Carpımı : "+(carpim(deger, deger)));


    }
    public static int carpim(int a,int b){

        int sonuc=a*b;
        return sonuc;
    }
}
