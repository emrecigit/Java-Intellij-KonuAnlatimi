package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {

        // Kullanıcıdan yaşını isteyin
        //eger negatif bir sayı girerse
        //        uyarı olarak IllegalArgumentException uyarısı verin
        //ancak kodunuz normal calısmaya devam etsin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz :");
        int yas= scan.nextInt();

        if(yas<=0){
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
               e.printStackTrace();
                System.out.println("Yaş sıfır veya negatif OLAMAZ");
            }

        }
    }
}
