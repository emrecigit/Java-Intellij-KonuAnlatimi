package day38_abstractClasses;

public class DChildClassOfAbstractClass extends CParentAbstractClass {

    /* Abstract bir class'daki abstract method'ların TAMAMI
    CONCRETE chıld class'lar tarafından override edilmelidir.
     */
    @Override
    public void mecburiMethod1() {
        System.out.println("Chıld class method içerisinde method'u kendıne uyarlar");
    }

    @Override
    public void mecburiMethod2() {

    }
}
