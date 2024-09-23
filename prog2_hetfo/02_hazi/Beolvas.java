import java.util.Scanner;

public class Beolvas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // billentyuzetrol olvas be
        System.out.printf("Adjon meg egy sztringet: ");
        String nev = sc.nextLine();
        System.out.printf("Hello %s\n", nev);

        System.out.println("Adj meg egy intet");
        int kor = sc.nextInt();

        System.out.printf("Nev: %s Kor %s\n", nev, kor);

    }
}
