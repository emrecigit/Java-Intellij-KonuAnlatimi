package ders13_nestedForLoop_methocOlusturma;

public class C07_MethodOlusturma {
    public static int ahmet(int a , int b){
        System.out.println("Merhaba Dünya");
        return a+b;
    }
    public static void main(String[] args) {
        String str="Java muhtesemdir";

        //metni buyuk harfe cevirin

       String buyukStr=str.toUpperCase();
        System.out.println(str);
        System.out.println(buyukStr);

        // metnin buyuk harflere cevrılmıs halı S içerir mi ?

        System.out.println(buyukStr.contains("S"));

      int  sayi=ahmet(10,20);
        System.out.println(sayi);


    }
}
