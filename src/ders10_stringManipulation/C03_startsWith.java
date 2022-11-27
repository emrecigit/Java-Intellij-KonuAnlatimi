package ders10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
        String str="manti açarken java öğrenilmez";

        System.out.println(str.startsWith("Manti")); // false
        System.out.println(str.startsWith("m")); // true
        str.startsWith("manti açarken java öğrenilmez"); //true
        str.startsWith(""); // true


        System.out.println(str.startsWith("açarken", 7)); // true
        System.out.println(str.startsWith("manti", 0));

    }
}
