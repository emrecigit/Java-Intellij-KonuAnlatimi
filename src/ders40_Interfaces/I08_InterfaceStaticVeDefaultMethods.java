package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {
    /* Java 8 ile developer'ların talabi üzerine yeni bir istisnai durum java'ya eklenmiştir
    bir isterface'i yıllar içerisinde yüzlerce class inherit etmiş olabilir.
    sonradan Interface'e eklenen bir abstract method tüm eski child'lar tarafından inherit
    edilmelidir. Aksi takdirde tüm eski child class'lar CTE verecektir.

    Java 8 ile birlikte Java, Interface'lere default ve static ile işaretlenmek şartı ile
    body'si olan method eklenmesine izin vermiştir.
    Bu sayede interface'e sonradan eklenen method body'si olduğu için
    override edilmek zorunda DEĞİLDİR.


     */
    void merhod1();
    void merhod2();


    //Interface'deki tüm method'lar public ve abstract'tır.
    /* Biz Interface'deki bir method deklarasyonuna default yazarsak
    bu access modifier değildir.
     */
    public default void merhod3(){
        System.out.println("Interface içindeki body'li default method");
    }
    public static void method4(){
        System.out.println("İnterface içindeki body'li static method");

    }


}
