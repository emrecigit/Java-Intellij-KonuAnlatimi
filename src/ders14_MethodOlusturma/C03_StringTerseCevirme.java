package ders14_MethodOlusturma;

import java.util.Scanner;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {
        // parametre olarak bir string kabul edip
        //String'in terse cevrılmiş halini döndüren bir method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir yazı giriniz :");
        String input= scan.nextLine();
        System.out.println(terseCevirme(input));

    }
    public static String terseCevirme(String str){
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            // tersStr+=tersStr.concat(str.substring(i,i+1));
            // tersStr+=str.charAt(i);
             tersStr+=str.substring(i,i+1);
        }
        return tersStr;
    }
}
