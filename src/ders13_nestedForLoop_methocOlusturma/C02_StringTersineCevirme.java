package ders13_nestedForLoop_methocOlusturma;

import java.util.Scanner;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen String bir değer giriniz : ");
        String input = scan.nextLine();
        String sentence="";
        for (int i = input.length()-1; i >=0 ; i--) {

            sentence+=input.substring(i,i+1);

        }
        System.out.println(sentence);
    }
}
