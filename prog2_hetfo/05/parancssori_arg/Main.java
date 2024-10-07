public class Main {
    
    public static void main(String[] args) {
       
        /* if (args.length == 0) {
            System.out.println("Nincs paranccsori argumentum. ");

        } else {
            System.out.println("Megadott argumentumok ");
            for (String elem: args) {
                System.out.println(elem);
            }
        }
        */
        if (args.length == 0) {
            System.exit(1);
        }
        int num = 0;
        String targetWord = "hello";
        boolean found = false;
        int count = 0;
        if (args.length == 0) {
            System.out.println("Nincs paranccsori argumentum. ");

        } else {
            
            for (int i = 0; i < args.length; ++i) {
                if (args[i].equals(targetWord)) {
                    found = true;
                    count++;
                }
            }
        }
        if (found) {
            System.out.println("Sikeresen megtalaltuk a szot " + count);
        } else {
            System.out.println("Nem talaltuk meg a szot");
        }
        System.out.println("osszeg " + sum);
    }
}
