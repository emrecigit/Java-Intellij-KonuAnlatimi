package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota{

    DCamry(String pc){
        super("Deniz");
    }
    DCamry(){

    }
    public static void main(String[] args) {

        // eger kullanılan argumente uygun bir constructor parent classta yoksa
        // direk CTE olur

        DCamry camry2=new DCamry("celal");
        System.out.println("=======================");
        DCamry camry1=new DCamry();
        //Paramatresiz Araba constructor
        //Parametreli Toyota Constructor
    }
}
