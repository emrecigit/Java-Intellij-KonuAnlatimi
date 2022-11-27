package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {
        /*

        email kontrolü yapan bir program hazirlayın
        1- mail @ işareti içermiyorsa " geçersiz email "
        2- @gmail.com içermiyorsa " gmail adresi giriniz "
        3- @gmail.com ile bitmiyorsa "yazım hatası"
        seklinde sonuc yardırın

         */

        String email="ismail@gmail.comm";
        if(!email.contains("@")){
            System.out.println(" Geçersiz email");
        }
        else if (!email.contains("@gmail.com")){
                System.out.println("gmail adresi giriniz ");
            }
        else if (!email.endsWith("@gmail.com")){
                    System.out.println("Yazım hatası");
                }
        else {
            System.out.println("email basari ile kaydedildi");
            }
        }}


