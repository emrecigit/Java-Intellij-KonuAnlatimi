package ders31_inheritance;

public class GCorolla extends FToyota {
    String model="Corolla";
    String uretimYeri="Türkiye";
    GCorolla(){
        System.out.println("Corolla cons. calisti");
    }
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka); // Toyota ( babasından alır :) )

        /* bir chıld class'dan oble olusturdugumuzda
        olusturulan obje sadece chıld class'a ait ozellıkleri degıl
        tum parent class'larındaki ozellıkleri de alır

        bir objenin bir class'in özelliklerini tasımasi için
        o obje olusturulurken class'a ait constructor'in calismıs olması gerekir
        Yani child class'ındaki obje olusturulurken
        tum parent class'lardaki constructor'lar da otomotik olarak calısır

        Java bu islem için soyle bir mekanızma gelistirmiştir
        Bir class olusturulurken biz constructor olusturmasak da
        Java nın a class'a default constructor koydugu gibi
        extend keyword kullanan v
         */
    }
}
