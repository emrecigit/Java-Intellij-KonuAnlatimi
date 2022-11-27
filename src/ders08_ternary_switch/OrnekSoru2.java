package ders08_ternary_switch;

import java.util.Scanner;

public class OrnekSoru2 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen ay numarasý giriniz :");
        int monthNo=scan.nextInt();

        switch (monthNo){

            case 12:
            case 1:
            case 2:
                System.out.println("Kýþ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ýlk bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son bahar");
                break;
            default:
                System.out.println("Yanlýþ Deðer Girdiniz ...");

        }

    }
}
