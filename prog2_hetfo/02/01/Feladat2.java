import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ket Szam osszege: %d\n", Integer.valueOf(args[0]) + Integer.parseInt(args[1]));

        System.out.printf("Adja meg az elso szamot: ");
        int elso = sc.nextInt();

        System.out.printf("Adja meg a masodik szamot: ");
        int masodik = sc.nextInt();

        System.out.printf("A ket szam osszege: %d\n", elso + masodik);

        System.out.println(duplaz(10));

        vonal("-", 10);

        System.out.println(greeting("Zoli"));
    }

    public static int duplaz(int a) { // ez egy metodus
        return a * 2;
    }

    public static void vonal(String c, int a) {
        System.out.println(c.repeat(a));
    }

    public static String greeting(String nev) {
        return String.format("Hello %s", nev);
    }
}
