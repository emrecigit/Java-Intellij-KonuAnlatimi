package ders34_overriding_pollymorphism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("Chıld class method1");
    }
    public void method2(int a){
        // overriding olabilmesi için
        // hem method ismi, hem de method signature aynı olmalıdır.
        System.out.println("Chıld class method2");
    }
    public void method2(String isim){
        System.out.println("Chıld class string parametreli method2");
    }

    @Override
    public void method3() {
      //  super.method3();
        // Overriding varsa parent ve chıld class'daki
        // overridden ve overriding method'lardan sadece biri calışır
        //Eger ıkısını bırden calıstırmak ıstersenız super.overriddenMethodIsmi yazılır
        /*
        Overriding method @ override notasyonu ile işaretlenebilir
        @Override kullanırmayan overriding isleminde ,
        parent class'daki overridden method sılınırse hıc bır sorun olmaz

        ancak @Override kullanılan overriding isleminde ,
        parent class'daki overridden method silinirse veya signature'i degiştirilirse
        JAVA CTE verir, böylece overridden method'un silinmesi engellenir
         */
    }

}
