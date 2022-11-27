package ders30_encapsulation;

public class EChild extends DParent{

    /*
    java'daki inheritance' insanlardan en büyük farklı :
    insanlardan parent chıld edebilir ama chıld parent'ını secemez
    Java'da ise tam tersidir
    - siz bir class oluşturduğunuzda daha önce oluşturulmuş tüm özelliklerini inherit etmek istediğniz
    class'i PARENT EDİNİRSİNİZ

    Bir class başka bir class'ı inherit etmek istediğinde extends keyword ile bunu deklare eder.

     */
    public static void main(String[] args) {
        EChild child1=new EChild();
        child1.yas=30;
        child1.isim="Mahmud";
        child1.isEnough=false;


    }
}
