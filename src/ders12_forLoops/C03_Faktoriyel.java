package ders12_forLoops;

import java.util.Scanner;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");
        //Kullanıcının verdiği sayının faktoriyelini bulalım
        // 5! =5*4*3*2*1=120

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int sayi= scan.nextInt();
        int toplam=1;
        for (int i = 1; i <=sayi ; i++) {

            toplam*=i;
            System.out.println("Faktoriyel : "+ toplam);
        }
        System.out.println(toplam);


    }
}
