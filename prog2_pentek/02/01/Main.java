import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elso szam: ");
        int a = scanner.nextInt();
        System.out.print("Masodik szam: ");
        int b = scanner.nextInt();

        int kerulet = getKerulet(a, b);
        System.out.println("Kerulet: " + kerulet);
    }

    static int getKerulet(int a, int b) {
        return 2 * (a +b);
    }
}