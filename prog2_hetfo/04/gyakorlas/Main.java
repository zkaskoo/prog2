import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 6 , 7, 8));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(10, 5, 5, 6 , 7, 8));
        MyUtils utils = new MyUtils(numbers);
        
        System.out.println(utils.equals(numbers2));
        //utils.fill(10);
        System.out.println(utils.isSorted());
        utils.kiir();

        //utils.fill(10);
        //System.out.println(utils.isSorted());
        
        System.out.println(utils.getMin());
        System.out.println(utils.getMax());
    }
}