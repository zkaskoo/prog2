import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Adjon meg egy stringet: ");
        String nev = sc.nextLine();
        if (nev.length() >= 3) {
            if (nev.endsWith("ing")) {
                String csere = "ly";
                nev = nev.substring(0, nev.length() - 3) + csere;
                System.out.println(nev);
            }
        } else {
            System.out.println(nev);
        }
    }

}
