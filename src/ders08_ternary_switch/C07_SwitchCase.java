package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase
{
    public static void main(String[] args) {

       // kullanıcan bir harf alın
        // alınan harf  J D K dan biri ise yukarıdaki kelimeleri yazdirin
        // bu harflerden biri depil ise " Geçersiz harf" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lütfen Harf giriniz");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'J':
            case 'j':
                System.out.println("JAVA");
                break;
            case 'D':
            case 'd':
                System.out.println("Devolepment");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Yanlış giriş");
        }



    }
}
