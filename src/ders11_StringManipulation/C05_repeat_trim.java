package ders11_StringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str="Java Güzeldir";
        System.out.println(str.repeat(4)); //Java GüzeldirJava GüzeldirJava GüzeldirJava Güzeldir
        //  istedıgınız metnı istedıgınız kadar tekrar eder

        str="   Java güzeldir     ";

        System.out.println(str.trim());
        System.out.println(str.length());

        // trim method'u strıngın basındakı ve sonundakı boslukları siler
}
}
