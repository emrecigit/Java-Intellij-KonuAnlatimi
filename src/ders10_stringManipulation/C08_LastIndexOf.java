package ders10_stringManipulation;

public class C08_LastIndexOf {
    public static void main(String[] args) {
        String str="Java hafiften beyin yakıyor";

        System.out.println(str.lastIndexOf("a")); // 21
        System.out.println(str.lastIndexOf('e')); // 15
        System.out.println(str.lastIndexOf("java")); // -1
        System.out.println(str.lastIndexOf("Java")); // 0
        System.out.println(str.lastIndexOf("e",14));// 11 14'uncu indexten bir öncekinden başlar


    }
}
