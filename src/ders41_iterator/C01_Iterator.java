package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        /* Java collection içerisindeki bazı class'lae index desteklemez !
        bu durumda index kullanmadan collection içerisindeki tüm elementlere ulaşabilmek
        ve onları update edebilmek için farklı ihtiyaçlarınız olur.

        List<> index yapısını desteklediği için böyle bir ihtiyaç duymaz
        ANCAK bugünlük index kullanmadan list elementlerine ulaşmaya ve onları update etmeye çalışalım
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // index kullanmadan list'in tüm elementlerini yazdırın .

        for (Integer each: sayilar){
            System.out.print(each+ " ");

        }
        System.out.println();
            // İNDEX kullanmadan List'in elementlerini birer arttırın.
            // İNDEX kullanmadan 25'den büyük sayıları List'den silin
        for (Integer each: sayilar){

            System.out.print(each+1+" ");
        }
        for (Integer each: sayilar){
            each+=1;
            System.out.println(each+ " ");
        }

        /* Index kullanmadan LİST'in elemanlarını kalıcı olarak değiştirmek mümkün olmadı :/
        Java bunun için Iterator İnterface'i oluşturmuştur.
         */
    }
}
