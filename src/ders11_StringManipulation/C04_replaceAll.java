package ders11_StringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        // Kullanıcının girdiği metinde
        // harf dışında kalan tum karakterleri temizleyen bir kod yazın
        //NOT: space silinmemeli
        String input="Ja5+va cok 1*guzel";
        input=input.replaceAll("\\d","");
        System.out.println(input);
        input=input.replace(" ","5");
        System.out.println(input);
        input=input.replaceAll("\\W","");
        System.out.println(input);
       input=input.replace("5"," ");

        System.out.println(input); //
    }
}
