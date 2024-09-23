

public class Book {

    public static void main(String[] args) {

        konyv konyv1 = new konyv("Harry Potter", "J.K. Rowling", 400); //Ez itt egy objektum, amit a konyv osztalybol hoztunk letre.

        konyv konyv2 = new konyv("Alapitvany", "Asimow", 255);

        konyv1.pages = 500;
        System.out.println("Oldalszam: " + konyv1.pages);
        System.out.println("Cim: " + konyv1.title);
        System.out.println("Cim: " + konyv2.title);
        
    }
    
}
