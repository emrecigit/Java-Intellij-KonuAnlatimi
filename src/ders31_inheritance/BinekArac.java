package ders31_inheritance;

public class BinekArac extends  Arac{
    protected String marka="Binek araçların markası olur";
    protected String model="Binek araçların modeli olur";
    protected int yil=1900;
    protected void hiz(){
        System.out.println("Binek araçların hızı modele göre değişir");
    }

    @Override
    protected void teker() {
        System.out.println("binek araçların dört tekeri olur");
    }
}
