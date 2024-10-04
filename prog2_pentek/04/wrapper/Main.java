class MyInteger {

    private int value;

    public final static int MAX_VALUE = 214783647; //nevesitett konstans

    public MyInteger (int value) {
        
        this.value = value;
    }

    @Override
    public String toString() {
        
        return "" + this.value;
    }

}
public class Main {
    
    public static void main(String[] args) {
        
        //Integer i = new Integer(2);
        
        MyInteger i = new MyInteger(2);
        System.out.println(i);
        System.out.println(MyInteger.MAX_VALUE);
    }
}
