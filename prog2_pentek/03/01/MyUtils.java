import java.util.Arrays;

public class MyUtils {
    
    public final static double PI = 3.14159;

    public static int duplaz (int a) {
        return 2*a;
    }

    public static int strlen(String s) {
        return s.length();
    }

    public static void reverse(int[] szamok) {
        int i = 0;
        int j = szamok.length -1;

        while (i < j) {
            int tmp = szamok[i];
            szamok[i] = szamok[j];
            szamok[j] = tmp;
            ++i;
            --j;
        }
    }
    public static void main(String[] args) {
        
        int[] szamok = {3, 1, 5, 9, 6, 8};

        System.out.println(Arrays.toString(szamok));

        MyUtils.reverse(szamok);

        System.out.println(Arrays.toString(szamok));

        System.out.println(MyUtils.duplaz(6));
        System.out.println(MyUtils.strlen("alma"));
        System.out.println(MyUtils.PI);
    }
}
