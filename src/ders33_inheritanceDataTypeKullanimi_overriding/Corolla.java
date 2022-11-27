package ders33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota {
    String model = "Corolla";
    String uretimYeri = "Türkiye";
    int yil = 2023;

    public static void main(String[] args) {
        /*
        Bir obje olusturulurken
        data türü ve constructor aynı class'tan ise
        bir VARIABLE'nin değerini bulmak için o class'a gideriz
        o class'ta yok ise sırasıyla parent class'lara bakılır
        ilk bulunan kullanılır
         */

        Corolla corolla1 = new Corolla();
        System.out.println(corolla1.model); // Corolla Class
        System.out.println(corolla1.uretimYeri); // Corolla Class
        System.out.println(corolla1.yil); // Corolla
        System.out.println(corolla1.marka); // BToyota
        System.out.println(corolla1.motor); // Araba
        System.out.println(corolla1.plaka); // Araba
        System.out.println(corolla1.yakit); // BToyota

        BToyota corolla2 = new Corolla();
        /*
        Obje oluşturulurken data türü ve constructor farklı ise
        VARIABLE değerini bulmak için data türü olan class'a
        gidilir . Varsa kullanılır , yoksa o class'ın parentlerıne bakılır
        bulunamaz ise CTE verir ( ama geri vites yapmaz)
         */
        System.out.println(corolla2.model); // BToyota Class
        // System.out.println(corolla2.uretimYeri); // CTE
        System.out.println(corolla2.yil); // BToyota Class
        System.out.println(corolla2.marka); // BToyota
        System.out.println(corolla2.motor); // Araba
        System.out.println(corolla2.plaka); // Araba
        System.out.println(corolla2.yakit); // BToyota
        Araba corolla3 = new Corolla();
        // System.out.println(corolla3.model); // CTE
        // System.out.println(corolla3.uretimYeri); // CTE
        //System.out.println(corolla3.yil); // CTE
        //System.out.println(corolla3.marka); // CTE
        System.out.println(corolla3.motor); // Araba class
        System.out.println(corolla3.plaka); // Araba class
        System.out.println(corolla3.yakit); // Araba class

        BToyota toyota1 = new BToyota();
        System.out.println(toyota1.marka); //BToyota
        System.out.println(toyota1.model); //BToyota
        System.out.println(toyota1.motor); //Araba
        System.out.println(toyota1.plaka); // Araba
        System.out.println(toyota1.yil);    //BToyota
        System.out.println(toyota1.yakit); //BToyota

        Araba toyota2 = new BToyota();
        // System.out.println(toyota2.marka); // CTE
        // System.out.println(toyota2.model); // CTE
        System.out.println(toyota2.motor); //Araba
        System.out.println(toyota2.plaka); // Araba
        // System.out.println(toyota2.yil);    // CTE
        System.out.println(toyota2.yakit); //Araba

        Araba toyota3 = new Araba();
        //  System.out.println(toyota3.marka); // CTE
        // System.out.println(toyota3.model); //CTE
        System.out.println(toyota3.motor); //Araba
        System.out.println(toyota3.plaka); // Araba
        // System.out.println(toyota3.yil);    // CTE
        System.out.println(toyota3.yakit); //BToyota
    }
}

