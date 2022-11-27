package ders36_checkedExceptions;

public class C01_IOExceptions {
    public static void main(String[] args) {
       // FileInputStream fis=new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");
       // FileOutputStream fos=new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");
        //Java ile bilgisayarımızdaki bir dosyaya ulaşmak istersek
        // FileInputStream class'ından obje oluşturup
        // o obje aracılığı ile dosyayı kullanabılırız

        // fis oluştururken ulaşmak istediğimiz dosyanın d
        // osya yolunu parametre olarak girmeliyiz
    /* Checked exception olustuma ıhtımalı olan kodları  yazdıgımızda
     Java Compıle Tıme orada bır hata ıhtımalı oldugunu gorur
      ve kodun altını kırmızı olarak çızer
      bu durumda kırmızı çizgiyi kaldırmak için 2(iki) yöntem vardır.
      1- Exception'u TRY CATCH blogu ile handle etmek
      2- Java'ya sorun ihtimalinin farkında olduğumuzu ama kodumuza güvendiğimizi ve
      çalışmaya devam etmesini istediğimizi söylemek
      bunun için method signature'a method declarasyonu ile curly braces arasına throws keyword
      ve beklenen exceptıon turu yazılabilir
     */
    }
}
