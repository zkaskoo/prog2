import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        //String s = "java 21";

        //for (char c : s.toCharArray()) {
        //    System.out.println(c);
        //}

        List<Integer> szamok = new ArrayList<>();
        szamok.add(2);
        szamok.add(3);
        szamok.add(5);

        System.out.println(szamok);

        List<Integer> copy = new ArrayList<>(szamok);

    }
}
