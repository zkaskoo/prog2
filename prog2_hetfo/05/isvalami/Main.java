public class Main {
    
    public static void main(String[] args) {
        char c1 = '5';
        System.out.println(Character.isDigit(c1));
        char c2 = 'a';
        System.out.println(Character.isLetter(c2));

        char c3 = '5';
        System.out.println(Character.isLetterOrDigit(c3));

        char c4 = 'A';
        char c5 = 'a';
        System.out.println(Character.isUpperCase(c4));
        System.out.println(Character.isLowerCase(c5));
    
        char c6 = ' ';
        System.out.println(Character.isWhitespace(c6));
    }
}
