package ders14_MethodOlusturma;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("İsminiz ? :");
        String name= scan.nextLine();
        System.out.print("Soyisim ? :");
        String surName= scan.nextLine();
        System.out.println(nameEdited(name,surName));
    }
    public static String nameEdited(String name , String surName){
        String nameSurName= name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+" "+
        surName.substring(0,1).toUpperCase()+surName.substring(1).toLowerCase();
        return nameSurName;
    }
}
