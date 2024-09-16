public class Muveletek {
    public static void main(String[] args) {

        String s = "Java programming";

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("Java", "C")); // Az adott stringet kicsereli
        System.out.println(s.startsWith("Java")); // megnezi, hogy az adott stringgel kezdodik e a string
        System.out.println(s.endsWith("ing")); // megnezi, hogy az adott string azzal vegzodik-e amit megadtunk.
        System.out.println(s.contains("Java")); // megnezi, hogy tartalmazza e a string az adott stringet.
        System.out.println(s.indexOf("J")); // megmondja, hogy hanyadik indexen van a megadott string. Ha nincs benne,
                                            // akkor -1 a visszateresi ertreke
        System.out.println(s.lastIndexOf("a")); // megnezi, hogy az adott string a stringbe hanyadik indexen fordul elo
                                                // utoljara
        System.out.println(s.equals("Java programming")); // megnezi, hogy az adott string megegyezik e a stringgel.
        System.out.println(s.equalsIgnoreCase("java programming")); // ignoralja a kis es nagtbetuket es ugy ellenorzi
                                                                    // le
        System.out.println(s.isEmpty()); // megnezi, hogy ures string e
        System.out.println(s.split(" ")[0]); // felspliteli a stringet
        System.out.println(s.split(" ")[1]); // felspliteli a stringet

        char[] chars = s.toCharArray();
        System.out.println(chars[1]);
        System.out.println(String.join("-", "java", "programming"));
        System.out.println(String.format("Korom: %d nevem %s \n", 25, "Zoli"));
        System.out.println("Korom " + 25 + " Nevem " + "Zoli");
        String s2 = "          Hello     ";
        System.out.println(s2.trim()); // eltavolitja a white spaceket
    }
}
