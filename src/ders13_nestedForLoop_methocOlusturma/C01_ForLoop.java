package ders13_nestedForLoop_methocOlusturma;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen String bir değer giriniz : ");
        String cumle = scan.nextLine();
        for (int i = cumle.length() - 1; i >= 0; i--) {

            System.out.print(cumle.charAt(i));
        }
    }
}
