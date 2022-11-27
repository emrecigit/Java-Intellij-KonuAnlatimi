package ders32_inheritanceConstructorCall;

public class GAvciKuslar extends FKuslar{
    public static void main(String[] args) {
       //  System.out.println("Bismillahirrahmanirrahim ");

        GAvciKuslar avci1=new GAvciKuslar();

        FKuslar avci2=new GAvciKuslar();

        EHayvanlar avci3=new GAvciKuslar();

        /* Bir Child class'da abje olusturmak için chıld class constructor'i kullanır.

            Ama data turunu o objenin baglı oldugu class'lardan  secebiliriz.

            Eger constructor ve data turu farklı secilirse
            bu durumda class uyesi olan veriable ve method'lar farkli davranıslar gösterirler

         */

    }
}
