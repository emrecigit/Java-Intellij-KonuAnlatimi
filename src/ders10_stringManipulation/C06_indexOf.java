package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9 ilk a'nın indexini dondurur

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("hersey")); //  15

        System.out.println(str.indexOf("e", 9)); // 13 9'uncu karakterden aramaya başla

        System.out.println(str.indexOf("e", 13)); // yine 13 verir

        // cumledeki 2.c'nin indexsini yazdırın

        int ilkIndex=str.indexOf("c");

        System.out.println(str.indexOf("c", ilkIndex + 1));

        System.out.println(str.indexOf("ali")); // eğer yok ise -1 döner
    }
}
