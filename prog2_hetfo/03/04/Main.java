
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        teglalap t = new teglalap(5, 10);
        teglalap t2 = new teglalap(4, 10);
        
        int hossz = 0;
        int magassag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a magassagot: ");
        magassag = sc.nextInt();
        
        System.out.print("Add meg a hosszat: ");
        hossz = sc.nextInt();

        teglalap t3 = new teglalap(magassag, hossz);

        System.out.println(t);
        System.out.println(t.terulet());
        System.out.println(t.kerulet());

        System.out.println(t.melyik_terulete_nagyobb(t2));
        System.out.println(t.melyik_terulete_nagyobb(t3));
    
    }
}