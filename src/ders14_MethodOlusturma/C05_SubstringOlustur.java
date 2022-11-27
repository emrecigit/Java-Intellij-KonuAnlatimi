package ders14_MethodOlusturma;

import java.util.Scanner;

public class C05_SubstringOlustur {
    public static void main(String[] args) {
        /*Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        String cumle= scan.nextLine();
        System.out.print("Başlangıç index'i giriniz : ");
        int basIndex= scan.nextInt();
        System.out.print("Bitiş index'i giriniz :");
        int bitisIndex= scan.nextInt();
        Substring(cumle,basIndex,bitisIndex);

    }
    public static void Substring(String cumle , int bIndex,int bitisIndex){
        if(bIndex>bitisIndex){
            System.out.println("Başlangıç ındex'i bitiş index'sinden büyük olamaz !");
        } else if (cumle.length()-1<bitisIndex||cumle.length()<bIndex) {
            System.out.println("İndex değeri girilen cumle index'inden buyuk olamaz !");
        }
        else {
            System.out.println(cumle.substring(bIndex, bitisIndex));
        }
    }
}
