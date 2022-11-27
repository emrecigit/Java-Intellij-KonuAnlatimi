package ders33_inheritanceDataTypeKullanimi_overriding;

public class EKuslar extends DHayvanlar{

    protected void kanat(){
        System.out.println("Kuslar Kanarlıdırlar");
    }
    protected void solunum(){
        System.out.println("Kuslar solunum akciğer ile yapar");
    }
    protected void gaga(){
        System.out.println("Kusların gagaları vardır");
    }
    protected void yumurta(){
        System.out.println("kuslar yumurtlarlar");
    }
}
