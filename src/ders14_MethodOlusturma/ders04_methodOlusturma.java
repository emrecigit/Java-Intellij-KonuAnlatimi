package ders14_MethodOlusturma;

public class ders04_methodOlusturma {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // bu iki sayının carpım sonucunu yeni kod yazmadan ekrana yazdırın

        System.out.println(C01_Carpim.carpim(a, b));

        String c="Nasil";
        String d="yani";
        // BU iki String'i aralarında bir bosluk bırakarak yazdırın.
        System.out.println(C02_StringConcate.stringConcate(c, d));

        String e=" Bu da mi oldu ?";
        // e String'ini terten yazdırın
        System.out.println(C03_StringTerseCevirme.terseCevirme(e));
    }
}
