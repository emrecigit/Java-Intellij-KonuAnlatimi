package ders11_StringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java Candır";


        System.out.println(str.replace('a','A')); //JAvA CAndır
        System.out.println(str.replace(' ','_')); //Java_Candır
        System.out.println(str.replace(" ","")); //JavaCandır

        //String'deki tüm a 'ları silin
        System.out.println(str.replace("a",""));  //Jv Cndır

        //Java yerine hava, candır yerıne cok guzel yazdıralım
        System.out.println(str.replace("Java","Hava").replace("Candır","Cok güzel"));

        System.out.println(str.replace("","_"));
        // sadece 1.a'yı A yapın
        System.out.println(str.replaceFirst("a","A")); //JAva Candır

    }
}
