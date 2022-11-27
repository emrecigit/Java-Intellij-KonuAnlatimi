package ders10_stringManipulation;

public class C02_contains {
    public static void main(String [] args){

        String str="Java ile kodlama çok zevkli";

        System.out.println(str.contains("çok")); // true

        System.out.println(str.contains("odla")); // true

        System.out.println(str.contains("a")); // true

        // System.out.println(str.contains('s'));  parametre olrak char kabul etmez
        // CharSequence : char dizisi
        System.out.println(str.contains("java")); // false j kucuk harf

        String str2="Java";
        System.out.println(str.contains(str2)); // true

        String str3="234 Ali Can";

        // str3.contains(2) sayı kabul etmez
        str3.contains("2"); // String olduğu için kabul eder.

    }
}
