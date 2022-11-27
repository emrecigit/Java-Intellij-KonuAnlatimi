package ders12_forLoops;

public class C02_ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            
        }
        //2 basamaklı sayılardan 7 ile bolunebılenlerı yan yana yazdırın
        System.out.println(" ");
        for (int i = 10; i < 100; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println(" ");
        // 13'den başlayıp 100'e kadar 7'ser 7'ser artırıp yazdıralım
        for (int i = 13; i <=100 ;i += 7 ) {
            System.out.print(( i)+ " ");
        }
        System.out.println(" ");
        //1'den 10'a kadar (sınırlar dahil) sayıların karalerını  yazdıralım
        for (int i = 1; i <=10 ; i++) {
            int karaleri=i*i;
            System.out.print(karaleri+ " " );

        }
        }
    }

