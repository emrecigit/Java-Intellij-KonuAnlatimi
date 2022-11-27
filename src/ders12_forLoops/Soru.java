package ders12_forLoops;

public class Soru {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan sayıları toplayın
        int total=0;
        for (int i = 1; i <=100 ; i++) {

            total+=i;
        }
        System.out.println("Sayıların toplamı : " + total);
    }
}
