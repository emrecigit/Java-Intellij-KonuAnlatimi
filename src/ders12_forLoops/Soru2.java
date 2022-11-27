package ders12_forLoops;

public class Soru2 {
    public static void main(String[] args) {

        //kullanıcıdan verdiği bir sayının asal olup olmadğını bulun
        // asal sayı : 1 ve kendisi dışında hiç bir tam sayıya tam bolunmeyen  sayi

        int sayi=8;
        boolean isAsal=false;
        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0)
            {
                isAsal=true;

                break;
            }
        }
        if (isAsal){
            System.out.println(sayi + " Sayısı asal bir sayı değildir.");
        }
        else {
            System.out.println(sayi + " Sayısı Asal bir sayıdır.");
        }
        }
}
