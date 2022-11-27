package ders10_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        System.out.println("Bismillahirrahmanirrahim");

        String str=" Java heryerde güzeldir";
        System.out.println(str.endsWith("güzeldir")); // true

        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("Java heryerde güzeldir"));
        System.out.println(str.endsWith("Java")); // false
    }
}
