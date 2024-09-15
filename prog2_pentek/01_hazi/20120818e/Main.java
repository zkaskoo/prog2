public class Main {
    // 20120818e

    public static void main(String[] args) {
        int osszeg = 0;
        for (int i = 0; i < 1000; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                osszeg += i;
            }
        }
        System.out.println(osszeg);
    }
}
