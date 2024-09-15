public class Main {
    public static void main(String[] args) {
        boolean ok = true;
        int big = 100_000;
        long y = 123445234234323534L;
        float valami = 6.78f;
        double pi = 3.14f;
        String text = "Java 21 rulz";

        int[] tomb1 = new int[3];
        tomb1[0] = 1;
        tomb1[1] = 2;
        tomb1[2] = 3;

        for (int i = 0; i < tomb1.length; ++i) {
            System.out.println(tomb1[i]);
        }

        System.out.println(ok);
        System.out.println(big);
        System.out.println(y);
        System.out.println(valami);
        System.out.println(pi);
        System.out.println(text);
    }
}

// primitiv tipusok: 8db
// egyszeru ertekek tarolasa
// minden mas referencia tipus ezek lesznek az objektumok
// komplex adatok / komplex objektumok tarolasara hasznaljuk

// a referencia valojaban egy mutato ami egy memoria teruletre mutat
// viszont annyiban ter el a C-beli mutatoktol, hogy
// ez egy egszerusitett mutato
// egy referencia erteke lehet null akkor azt mondjuk, hogy
// az adott referencia sehova nem mutat vagy mutat valamilyen objektumra

// int[] tomb1 = new int[3];
// Stack(tomb1) heap int[3];
// tomb1[0] = 1;
// tomb1[1] = 2;
// tomb1[2] = 3;

// int[] tomb2[] = tomb1;
// tomb2[0] = 100;
// sout (tomb1[0]) akkor tomb1[0] = 100;

// primitiv tipusukrol ertekadaskor masolat keszul.

// a refencia tipusu objektumok szamara memoriat kell allocalni erre a
// new operatort hasznaljuk (a mallochoz hasonlo)
// automatikusan manadzseli a dinamikusan lefoglalt tarteruleteket.
// a java un. garbage collectorral rendelkezik.
// a futtato kornyezet refenecia szamlalast vegez (reference counting).
// folyamatosan figyeli, hogy egy dinamikusan lefoglalt tarteruletre(objektumra)
// hany db referencia mutat
// ha a referenciak szama lecsokken nullara, akkor az azt jelenti, hogy arra a
// memoria teruletre senki se mutat vagyis az a memoria terulet
// elerhetettlenne valt.
// a futtto kornyezet automatikusan felfogja szabaditani a mar nem hasznalt
// teruletet.
