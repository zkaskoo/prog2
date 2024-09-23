

class Circle 
{
    private double sugar;

    public Circle(double sugar) {
        this.sugar = sugar;
    }

    //@Override

    public double getSugar() {  //getter
        return this.sugar;
    }

    public void setSugar(double sugar) { //setter
        this.sugar = sugar;
    }

    public  double sugar() {
        return Math.PI * this.sugar * this.sugar;
    }

    public  double kerulet() {
        return Math.PI * 2 * this.sugar;
    }

    @Override

    public String toString() {
        return String.format("Kor sugara: %f", this.sugar);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.56);
        System.out.println(c.getSugar());
        c.setSugar(9.3);
        System.out.println(c.getSugar());
        System.out.println(c.sugar());
        System.out.println(c.kerulet());

        System.out.println(c);

    }
}