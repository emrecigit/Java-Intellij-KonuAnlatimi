package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {
    /* kullanıcıdan bir index isteyin
    verilen bir array'den kullanıcının girdiği index'deki elementi yazdırın
     */
    public static void main(String[] args) {
        int[] arr={3,4,6,7,8,2,3,5,6,8,9,1};

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir index giriniz :");
        int index= scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException hata) {
            System.out.println(hata.getMessage());
            hata.printStackTrace();/*java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 12
	at ders35_exceptions.C03_ArrayIndexOutOfBoundsException.main(C03_ArrayIndexOutOfBoundsException.java:17)
	Javanın yazdıgıtum hata mesajını verir ama kodlar calısmaya devam eder.

	catch blogunda hıcbır kod olmasa da kodlarımız normal calısmaya devam eder
	catch blogun'da kullanıcıya yazdıracagım mesaj tamamen kod yazanın ınsıyatıfındedır.
	exception class'ıda hazır hata
	*/
        }
        }
    }
