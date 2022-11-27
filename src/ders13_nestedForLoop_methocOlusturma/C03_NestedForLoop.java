package ders13_nestedForLoop_methocOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        // 1-4 arasındaki sayılar için çarpım taplosu olusturalım

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j+ " ");
            }
            System.out.println("");
        }
    }
}
