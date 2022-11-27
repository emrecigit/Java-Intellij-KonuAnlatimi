package ders31_inheritance;

public class DOtomobil extends BinekArac{
    public static void main(String[] args) {

        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        // Inheritance sayesinde bir Child class olusturdugumuzda
        // yeni hicbir variable veya method olusturmadan
        // parent class(lar) daki tum ozellıkleri almıs oluruz
        // Chıld classlarda parent dan gelen ozellıkleri
        // update edebilir veya yeni ozellıkler ekleyebiliriz

    }
}
