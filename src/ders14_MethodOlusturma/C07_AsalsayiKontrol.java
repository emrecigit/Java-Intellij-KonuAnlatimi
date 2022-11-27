package ders14_MethodOlusturma;

import java.util.Scanner;

public class C07_AsalsayiKontrol {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun.

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int sayi= scan.nextInt();
        asalsayiKontrol(sayi);

    }
    public static void asalsayiKontrol(int a){

        for (int i = 2; i <a ; i++) {
            if(a%i==0){
                System.out.println(a+" Sayısı asal değildir.");
                break;
            }
            else {
                System.out.println(a+" Sayısı asaldır.");
                break;
            }
        }
    }
}
