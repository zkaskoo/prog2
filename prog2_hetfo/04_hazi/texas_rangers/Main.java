import java.util.ArrayList;
import java.util.List;

class Utils {

    private Utils() {
        //nem peldanyosithato
    }

    public static List<Integer> range(int hi) {
        //return range(0, hi, 1); //+1 hivas
        return range(0, hi);    //+2 hivas
    }

    public static List<Integer> range(int lo, int hi) {
        return range(lo, hi, 1);

    }
    public static List<Integer> range(int lo, int hi, int step) {
        List<Integer> result = new ArrayList<>();

        for (int i = lo; i < hi; i += step) {
            result.add(i);
        }

        return result;
    }

}

public class Main {

    public static void main(String[] args) {

        //List<Integer> result1 = Utils.range(20);
        //List<Integer> result2 = Utils.range(5, 20);
        List<Integer> result3 = Utils.range(20, 40, 5);

        //System.out.println(result1);
        System.out.println(result3);
        //System.out.println(result2);
        

        List<Integer> szamok = new ArrayList<>();
        szamok.add(2);
        szamok.add(3);
        szamok.add(5);

        kiir(szamok);
    }

    public static void kiir(List<Integer> lista) {

        System.out.println(lista);
    }
}
