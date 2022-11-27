package team05;

public class Soru03 {
    public static void main(String[] args) {
        String str1 = "haknglm";
        String str2 = "haknglm";
        boolean bln = true;

        System.out.println(sameLetters(str1,str2,bln));

    }
    public static boolean sameLetters(String str1, String str2, boolean bln){
        int bayrak=0;
        boolean sonuc=false;

        if (str2.length()!=str1.length()) {
            sonuc = false;
        }else  {

            for (int i = 0; i < str2.length(); i++) {

                if (str2.contains(str1.substring(0,1))) {
                    str1 = str1.replaceAll(str1.substring(0, 1), "");
                    bayrak++;
                }
            }
        }
        if (bayrak==str2.length()){
            sonuc=true;
        }


        return sonuc;
    }


}
