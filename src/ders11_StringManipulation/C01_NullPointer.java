package ders11_StringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1=""; // str1'e değer atanmıştır.
        System.out.println(str1); // hıclık yazdırır
        System.out.println(str1.concat("Java")); // java

        String str2; // str2 oluşturuldu fakat değer atanmadı

       // System.out.println(str2); // str2'e deger atanmadığı ıcın yazdırılamaz cte verir
      //  System.out.println(str2.concat("Java")); dege atanmadıgı ıcın method kullanılamaz .

        str2="Java candır";
        System.out.println(str2); // Java candır
        System.out.println(str2.concat("."));//Java candır.

        String str3=null; // str3'e değer atanmamıştır.
                            // null pointer ile javaya deger atamadıgımızn farkında oldugumuzu soyluyoruz
        System.out.println(str3); //null işaretlendiğini yazdıdır

      //  System.out.println(str3.concat("Java"));// NullPointerExeption hatası verir.

        System.out.println(str3+"Java"); //nullJava yazar

        System.out.println(str2.equalsIgnoreCase(str3));
    }
}
