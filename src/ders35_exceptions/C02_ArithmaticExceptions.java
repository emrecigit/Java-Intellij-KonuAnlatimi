package ders35_exceptions;

public class C02_ArithmaticExceptions {
    public static void main(String[] args) {
        /* Verilen iki tamsayıyı sayıyı bir birine bölüp sonucun tam sayı kısmını
        yazdırın
         */
        int sayi1=20;
        int sayi2=0;

        try {
            //riskli oldugunu öngördüğünüz kodlar
            System.out.println(sayi1/sayi2);

        } catch (Exception e) {
            // catch (Exception e) öngördüğümüz risk
            System.out.println("Sayı sıfıra bölünemez ");

            // catch'den sonraki {} CATCH blogu denir
            // beklenen risk gerceklesirse calıscak kodlar
        }

        /* Bazı exception'lar if else ile handle edilebilir ancak
        tüm exception'lar  için if yeterli olmaz

         */
    }
}
