import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tomb = getOneToFive(); //[1, 2, 3, 4, 5]
        
        System.out.println(Arrays.toString(tomb));
    }

    static int[] getOneToFive() {
        
        int[] result = {1, 2, 3, 4, 5};
        return result;
    }

}