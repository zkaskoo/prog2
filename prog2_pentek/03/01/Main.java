class Rectangle {

    private int side_a;
    private int side_b;


    public Rectangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public int getA() {
        return this.side_a;
    }


    public int getB() {
        return this.side_b;
    }

    @Override
    
    public String toString() {
        return String.format("Rectange(a: %d ), (b: %d)", this.side_a, this.side_b);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Rectangle rt1 = new Rectangle(3, 5);
        Rectangle rt2 = new Rectangle(2*rt1.getA(),2*rt1.getB());

        System.out.println(rt2);
    }
}