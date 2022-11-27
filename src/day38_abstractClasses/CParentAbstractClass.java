package day38_abstractClasses;

public abstract class CParentAbstractClass {
    /*
    Abstract bir class method'lara sahip olarabilir
    Bir Class'ı abstract yapmak için
    class declaration'ına abstract keyword eklenmelidir.
     */
    public abstract void mecburiMethod1();
    public abstract void mecburiMethod2();
    /*
    Soyut(abstract) method'ların body'si olmaz
     */
    public  String concreteMethod(){
        return "";

    }
    /* bugune kadar kullandıgımız normal method'lara soyut olmayan method demek yerıne
    CONCRETE method denir
     */
       // System.out.println("parent abstract method 1");

    /*
    Bir parent class'da child class'ların mutlaka override edeceği bir method olusturdugumuzda
    method body'si gereksizlerşir cünkü hiç çalışmayacaktır

    1- Abstract Parent class'dan obje oluşturulamayacağı için objeler için bu method kullanılamaz
    2-Chıld class'larda mecburen bu method'u override edeceklerinden, bu merhod'ların body'si asla
    KULLANILMAYACAKTIR.
    Java hiç kullanılmayacak bu method body'leri yazmamamıza imkan tanımıştır.

    Chıld class'ların mutlaka override etmesini istediğimiz method'ları abstract olarak tanımlar ve
    body'siz olarak oluştururuz.
     */
}
