package ders12_forLoops;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen başlangıç değerini giriniz :");
        int basDegeri= scan.nextInt();
        System.out.print("Lütfen bitiş değerini giriniz :");
        int bitDegeri= scan.nextInt();
        if (bitDegeri<basDegeri){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz !");
        }
        else {
            for (int i = basDegeri; i <=bitDegeri; i++) {
                toplam+=i;
            }
            System.out.println("Değerler toplamı : " + toplam);
        }

    }
}
