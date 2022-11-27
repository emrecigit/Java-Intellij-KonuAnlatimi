package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar {
    public void hareket() {
        System.out.println("Avci kuslar ucarlar");
    }

    public void beslenme() {
        System.out.println("Avci kuslar et yerler");
    }

    public void pence() {
        System.out.println("Avci kuslar penceledir");
    }

    public void gaga() {
        System.out.println("Avci kuslar gagaldır");
    }

    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");

        FAvciKuslar avci1 = new FAvciKuslar();
        /* bir obje olusturulurken constructor ve data türü aynı ise
        Hangi METHOD'un geçerli oldupunu bulmak için o class'a gider
        varsa kullanırız . yoksa sırası ile parent'lara gider
        ilk bulduğumuzu kullanırız.
         */
        avci1.beslenme(); // FAvcikuslar class
        avci1.cogalma(); // EKuslar
        avci1.solunum(); // EKuslar
        avci1.gaga(); // FAvcikuslar class
        avci1.pence(); // FAvcikuslar class
        avci1.hareket(); // FAvcikuslar class
        avci1.kanat(); // EKuslar
        avci1.omur(); //DHayvanlar

        EKuslar avci2 = new FAvciKuslar();
        /*
        Bir obje oluşturulurken data türü ile constructor farklı ise hangi method'un
        geçerli olacağını bulmak için önce data türünün olduğu class
        ve parent'larına bakarak o method'u buluruz
        bulamaz isek CTE verir ,
        bulurisek HEMEN ÇALIŞTIRMAYIZ
        çalıştırmadan önce o method override edilmiş mi diye control ederiz
        override edilmiş ise override eden method'u calıştırırız.
         */
        avci2.beslenme(); // FAvcikuslar class
        avci2.gaga(); // FAvcikuslar class
        // avci2.pence(); // CTE
        avci2.cogalma(); // EKuslar
        avci2.hareket(); // FAvcikuslar class
        avci2.kanat(); // EKuslar
        avci2.omur(); //DHayvanlar
        avci2.solunum(); // EKuslar

        DHayvanlar avci3=new FAvciKuslar();
        avci3.beslenme(); // FAvcikuslar class
        // avci3.gaga(); // CTE
        // avci3.pence(); // CTE
        avci3.cogalma(); // EKuslar
        avci3.hareket(); // FAvcikuslar class
        // avci3.kanat(); // CTE
        avci3.omur(); //DHayvanlar
        avci3.solunum(); // EKuslar

        EKuslar kus1=new EKuslar();
        kus1.cogalma();
        kus1.gaga();
        kus1.kanat();
        kus1.hareket(); // Hayvanlar
        kus1.solunum(); //Kuslar
        kus1.beslenme(); // Hayvanlar
        kus1.omur(); // Hayvanlar

        /* METHOD'larla belirlenen özellikler
        en güncel bilgiyi bulurken veriable' ile belirlenen özellikler ilk buldugu degeri kullanır.
        bunun için METHOD'lara DİNAMİK , VERIABLE'lalara STATİK  Özelliklidir
         */
        DHayvanlar kus2= new EKuslar();
        kus2.cogalma(); // Kuslar
      //  kus2.gaga(); CTE
       //  kus2.kanat(); CTE
        kus2.hareket(); // Hayvanlar
        kus2.solunum();// Kuslar
        kus2.beslenme();// Hayvanlar
        kus2.omur(); //Hayvanlar

    }
}