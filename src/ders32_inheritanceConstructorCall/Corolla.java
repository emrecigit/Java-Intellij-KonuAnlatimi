package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota {

    Corolla(int pc){
        super(5);
        System.out.println("Parametreli Corolla Constructor");
    }
    Corolla(){

    }
    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla cons.");
    }
    public static void main(String[] args) {
        // System.out.println("Bismillahirrahmanirrahim");
        Corolla corolla3=new Corolla("Ilker");

        System.out.println("========================");
        Corolla corolla1=new Corolla();
        //Paramatresiz Araba constructor
        //Parametresiz Toyota Constructor
        Corolla corolla2=new Corolla(3);
    }
}
