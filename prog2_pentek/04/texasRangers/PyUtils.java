import java.util.ArrayList;
import java.util.List;

public class PyUtils {

    private PyUtils() {
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
