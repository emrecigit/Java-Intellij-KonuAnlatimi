package ders10_stringManipulation;

import java.util.Scanner;

public class C09_Soru {
    public static void main(String[] args) {
        /* Kullanıcıdan bir cümle ve bir metin alın
        cumlede metnin durumuna göre
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere içeriyor
        3- cümle metni birden fazla iceriyor
        seceneklerinden uygun olanı yazdırın
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz :");
        String sentence=scan.nextLine();
        System.out.print("Lütfen bir metin giriniz :");
        String letters=scan.nextLine();
        if (!sentence.contains(letters)){
            System.out.println("Cümle metni içermiyor.");
        }
        else {
            int firstIndex=sentence.lastIndexOf(letters);

            int secondsIndex=sentence.lastIndexOf(letters,firstIndex-1);
            if (secondsIndex!=-1){
                System.out.println("Cumle metni birden fazla içeriyor");
            }
            else {
                System.out.println("Cümle metni sadece bir kere içeriyor");
            }
        }
    }
}
