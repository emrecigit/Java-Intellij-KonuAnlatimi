package ders11_StringManipulation;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
        /*Soru 1 : Kullanicidan bir cumle alin
- cumlede ev geciyorsa, "home home sweet home" yazdirin
- cumlede is geciyorsa, "calismak guzeldir"
- ikisini de iceriyorsa "Hem ev lazim hem is"
- hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cğmle giriniz :");
        String sentence= scan.nextLine();
        String sentenceCopy=sentence.toLowerCase();
        if(sentence.contains("ev")&&sentenceCopy.contains("is")){
            System.out.println("Hem ev lazım hem is");
        }
        else if (sentenceCopy.contains("ev")) {
            System.out.println("home home sweet home");
        }
            else if (sentenceCopy.contains("is")){
                System.out.println("calısmak güzeldir");
            }
            else {
            System.out.println("Cok calısman lazım");
        }

        }

}