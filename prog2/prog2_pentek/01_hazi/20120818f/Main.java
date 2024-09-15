public class Main {

    public static void main(String[] args) {
        int SzamonKentiNegyzet = 0;
        int OsszNegyzet = 0;
        int Osszeg = 0;
        for (int i = 1; i <= 100; ++i) {
            SzamonKentiNegyzet += i * i;
            Osszeg += i;
        }
        OsszNegyzet = Osszeg * Osszeg;
        System.out.println(SzamonKentiNegyzet);
        System.out.println(OsszNegyzet);
        System.out.println(OsszNegyzet - SzamonKentiNegyzet);
    }
}
