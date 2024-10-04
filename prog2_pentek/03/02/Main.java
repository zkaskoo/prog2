
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] szamok = {23, 43, 12, 54, 65};
        
        System.out.println(Arrays.toString(szamok));
        kiir(szamok);
    }

    static void kiir(int[] numbers) {
        
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i] + ", ");
        }
        System.out.println();
        numbers[0] = 99;

    }
}