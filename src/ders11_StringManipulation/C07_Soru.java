package ders11_StringManipulation;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {
        /*Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
        - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
            harflerle yazdirin.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim giriniz :");
        String name= scan.nextLine();
        System.out.println("Lütfen Soyisim giriniz :");
        String surName= scan.nextLine();
        if(name.length()>surName.length()) {
            System.out.println(name.substring(0, 1).toUpperCase()+name.substring(1) +" "+
                    surName.substring(0, 1).toUpperCase()+surName.substring(1));
        }
            else if (surName.length()>name.length()){
            System.out.println(name.substring(0, 1).toUpperCase()+name.substring(1) +" "
                    + surName.toUpperCase());
            }
            else {
            System.out.println("isim ve soyisim soru için uygun değil");
        }
        }
    }

