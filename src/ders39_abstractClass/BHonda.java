package ders39_abstractClass;

public abstract class BHonda extends Araba {
    /* Abstract bir klası parent edindiğimizde iki alternatifimiz olur
    1 - Parent'imiz olan abstract class'daki abstract method'ları override etmek
    2 - Proje yapımız gerektiriyorsa bu class'ıda abstract yapmak
     */

    @Override
    public void marka() {
        System.out.println("marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji() {
        System.out.println("Tüm Honda arabalar vtec teknolojisi kullanır.");
    }
}


