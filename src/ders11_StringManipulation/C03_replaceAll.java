package ders11_StringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="J1ava2 G9uzel5dir8";

        // str'daki sayuları silin metni Java Guzeldir halie donusturelım
        //str.replaceAll() sadece bir harf veya char sequence'i  degil genelleme ile soyleyebılecegımız ortak ozellıkteki
        // tum karakterleri degstırır
        System.out.println(str.replaceAll("\\d","")); // Java Guzeldir
        System.out.println(str.replaceAll("\\D","")); //12958

        String str1="İlk ürün fiyatı 1250 tl";
        String str2="İkinci ürün fiyatı 1500 tl";

        //iki ürünün fiyatını toplayın

       str1= str1.replaceAll("\\D","");
       str2=str2.replaceAll("\\D","");
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

    }
}
