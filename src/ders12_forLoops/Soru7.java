package ders12_forLoops;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.
        int faktoriyel=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 20'den küçük bir değer giriniz :");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {

            faktoriyel*=i;
            System.out.print(faktoriyel+" * ");

        }

        System.out.print("="+faktoriyel);
    }
}
