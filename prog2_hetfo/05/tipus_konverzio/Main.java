import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        //impicit
        int num = 10;
        long longNUm = num;
        double doubleNum = num;

        System.out.println("Implicit int -> long: " + longNUm);
        System.out.println("Implicit int -> double: " + doubleNum);

        //explicit
        double decimalValue = 9.78;
        int intValue = (int)decimalValue;
        System.out.println("implicit double -> int: " + intValue);

        //string -> int
        String numberstr = "123";
        int number = Integer.parseInt(numberstr);
        System.out.println("String -> int: " + number);

        //string -> double
        String numberstr2 = "123.5";
        double number2 = Double.parseDouble(numberstr2);
        System.out.println("String -> double: " + number2);

        Integer numobject = Integer.valueOf(100);
        int newint = numobject.intValue();
        System.out.println(newint);

        //string -> long
        String strlong = "111111111111111";
        long longvalue = Long.parseLong(strlong);
        System.out.println("String -> long: " + longvalue);

        //string -> float
        String strfloat = "3.14";
        float floatvalue = Float.parseFloat(strfloat);
        System.out.println("String -> float: " + floatvalue);
    
        //string -> char 
        String strchar = "a";
        char charvalue = strchar.charAt(0);
        char char2value = strchar.toCharArray()[0];
        System.out.println("String -> char: " + charvalue);
        System.out.println("String -> char: " + char2value);

        //
        //
        //

        String dbvalue = "45.67";
        double db = Double.parseDouble(dbvalue);
        System.out.println(Math.pow(db, 2));

        //
        //
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy double erteket: ");
        double userinput = sc.nextDouble();
        System.out.println((int)userinput);
        sc.close();

    }
}