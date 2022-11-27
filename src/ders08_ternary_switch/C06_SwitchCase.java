package ders08_ternary_switch;
import java.util.Scanner;
public class C06_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");
        // Kullanıcıdan girdiği gun numarasının
        // gun ismini yazdırın


        int gunNo=3;

        if(gunNo==1){
            System.out.println("Pazartesi");
        } else if (gunNo==2) {
            System.out.println("Salı");
        } else if (gunNo==3) {
            System.out.println("Çarşamba");

        } else if (gunNo==4) {
            System.out.println("Perşembe");

        } else if (gunNo==5) {
            System.out.println("Cuma");

        }else if (gunNo==6) {
            System.out.println("Cumartesi");

        }else if (gunNo==7) {
            System.out.println("Pazar");

        }else {
            System.out.println("Geçersiz gün muraması");

        }
        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz Gün Numarası");
                break;

        }

    }
}
