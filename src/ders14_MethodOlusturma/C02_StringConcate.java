package ders14_MethodOlusturma;

import java.util.Scanner;

public class C02_StringConcate {
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");

        //verilen iki String'i parametre olarak kabul edip , bu iki String'i aralarında bir bosluk olan
        // tek bir String olarak main method'a donduren bir method olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki String değer giriniz : ");
        String str1= scan.nextLine();
        String str2= scan.nextLine();
        System.out.println(stringConcate(str1,str2));
    }
     static String stringConcate(String a, String b){

        return a.concat(" ".concat(b));
    }
}
