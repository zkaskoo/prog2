class Rectangle {
    public int a_oldal;
    public int b_oldal;

    public Rectangle(int a, int b) {
        this.a_oldal = a;
        this.b_oldal = b;

    }

    public int getKerulet() {
        return 2 * (this.a_oldal + this.b_oldal);
    }
}

public class Main {

    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        Rectangle r1 = new Rectangle(a, b);
        System.out.println("Kerulet: " + r1.getKerulet() );
    }
}