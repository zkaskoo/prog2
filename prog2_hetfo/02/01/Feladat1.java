import java.util.Scanner;

//20121001a
public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nev: ");

        String nev = sc.nextLine().trim();
        System.out.printf("Hello %s\n", nev);
    }

}
