package ders10_stringManipulation;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");
        /* Kullanıcıdan bir cümle ve bir metin alın
        cumlede metnin durumuna göre
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere içeriyor
        3- cümle metni birden fazla iceriyor
        seceneklerinden uygun olanı yazdırın
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Cümle Giriniz :");
        String cumle= scan.nextLine();
        System.out.print("Lütfen Metin giriniz :");
        String metin= scan.nextLine();

        if (!cumle.contains(metin)){
            System.out.println("Cümle metni içermiyor ");
        }
        else {

            int ilkIndex=cumle.indexOf(cumle);

            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);
            if (ikinciIndex==(-1)){
                System.out.println("Cümle metni sadece 1 kere içeriyor");

            }
            else {
                System.out.println("Cümle birden fazla metin  içeriyor");
            }

        }

    }
}
