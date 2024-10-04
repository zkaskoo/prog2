
class MethodOverLoad {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add (float a, float b) {
        return a + b;
    }

    public long add (long a, long b) {
        return a + b;
    }

    public long add(int... numbers) {
        int sum = 0;
        for(int szam : numbers) {
            sum += szam;
        }
        return sum;
    }
}

public class Main {

    public static void main(String[] args) {
        
        MethodOverLoad  methodOverLoad = new MethodOverLoad();
        System.out.println(methodOverLoad.add(1,3));
        System.out.println(methodOverLoad.add(3, 4, 5));
        System.out.println(methodOverLoad.add(3.42, 3.23));
        System.out.println(methodOverLoad.add(4.32f, 3.23f));
        System.out.println(methodOverLoad.add(34423432432432L, 532423423432423L));
        System.out.println(methodOverLoad.add(3, 4, 5, 6, 7, 8, 11));

        
    }
}