package ders31_inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {

        System.out.println("Bismillahirrahmanirrahim");

        CSuv suv1=new CSuv();
        System.out.println(suv1.marka); // Binek araçların markası olur
        System.out.println(suv1.model); // Binek araçların modeli olur
        System.out.println(suv1.motor); // Tüm araçlar  motor kullanılır
        System.out.println(suv1.plaka); // Tüm araçların plaskası olur
        System.out.println(suv1.yakit); // Araçlar farklı yakıtlar kullanır
        System.out.println(suv1.yil); // 1900
        suv1.hiz();  // Binek araçların hızı modele göre değişir
        suv1.teker(); // binek araçların dört tekeri olur

        CSuv suv2=new CSuv();
        suv2.marka="Toyota";
        suv2.model="HRV";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv1.hiz("benzin");






    }

    public void hiz(String yakit){

        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinlik SUV'ler max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {

            System.out.println("Dizel SUV'ler max 260 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'ler max 220 km hiz yapar");

        }
        else {
            System.out.println("yakit belli değil , max hiz bilinm");
        }

    }
}
