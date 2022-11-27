package ders39_abstractClass;

public abstract class Araba {

    // Araba class'ını inherit eden tüm class'lar
    // motor , kasa ve tekerlek metodlarını override etmek zorunda kalsın
    // Ancak abs, klima method'ları opsiyonel olsun
    // isteyen child bu method'ları override etsin isteyen override etmesin
    public abstract void motor();


    public abstract void kasa();


    public abstract void teker();
    public abstract void marka();
    public void abs(){
        System.out.println("Güvenlik arttırmak isteyen arabalar ABS kullanmalı");
    }
    public void klima(){
        System.out.println("Konfor arttırmak isteyen arabalar klima kullanmalı");
    }



}
