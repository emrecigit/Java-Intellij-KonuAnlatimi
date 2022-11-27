package ders40_Interfaces;

public interface I01_Interface {

    /* Interface'ler özel yapı olduklarından yazılsa da yazılmasa da , tüm veriable'lar
    public static ve final'dir.*/
    String MESAJ = "Hello World";
    static int SAYI = 20;
    public static boolean guzelMi = true;
    public static final int SAYI2 = 30;

    // Normal'de veriable isimleri kucuk harfle başlar ve camelCase kullanılır
    // ancak Java'da ortak kabul olarak
    // static ve final olarak işaretlenen veriable isimleri tamamen büyük harf ile yazılır.

    //Aynı şekilde tüm method'lar publıc ve abstract'tır.

    void method1();
    abstract int method2();
    public abstract String method3();
}
