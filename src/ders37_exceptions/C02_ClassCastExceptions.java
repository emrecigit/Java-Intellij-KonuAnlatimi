package ders37_exceptions;

public class C02_ClassCastExceptions {
    public static void main(String[] args) {

        short sayi1=23;
        int sayi2=sayi1;

        Short sayi3=24;

        // Integer sayi4=sayi3; Integer ve Short arasında parent  chıld ilişkisi olmadıgından
       //       birbirine atama yapamazsınız
        // Aralarında parent chıld ilişkisi olan class'lardan olusan
        // objeler için outo-widening veya explicit-narrowing munkundur
        Object obj=sayi3;
        System.out.println("Short'dan obje'ye cast edince" +obj);

        Integer sayi5=(Integer) obj;

        System.out.println("Short datayi obje üzerinden Integer'e cevirince"+sayi5);
        // ClassCastException

    }
}
