import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    // A. match_ends
    private static int matchEnds(List<String> words) {
        int count = 0;
        for (String word : words) {
            // Ellenőrizzük, hogy a szó legalább 2 karakter hosszú és az első és utolsó karakter megegyezik
            if (word.length() >= 2 && word.charAt(0) == word.charAt(word.length() - 1)) {
                count++;
            }
        }
        return count;
    }

    // B. front_x
    private static List<String> frontX(List<String> words) {
        List<String> xWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();
        
        // Szétválasztjuk az "x"-szel kezdődő szavakat és a többit
        for (String word : words) {
            if (word.startsWith("x")) {
                xWords.add(word);
            } else {
                otherWords.add(word);
            }
        }

        // Rendezzük mindkét listát
        Collections.sort(xWords);
        Collections.sort(otherWords);
        
        // Egyesítjük a két listát, először az "x"-es szavak, majd a többiek
        xWords.addAll(otherWords);
        return xWords;
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(int got, int expected) {
        String prefix = (got == expected) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(List<String> got, List<String> expected) {
        var prefix = (got.equals(expected)) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Ezt ne módosítsuk.
    // A main() fv. meghívja a fenti fv.-eket különféle paraméterekkel,
    // s a test() fv. segítségével megnézi, hogy az eredmények helyesek-e.
    public static void main(String[] args) {
        System.out.println("match_ends");
        test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
        test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
        test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

        System.out.println();
        System.out.println("front_x");
        test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
                List.of("xaa", "xzz", "axx", "bbb", "ccc"));
        test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
                List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
        test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
                List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
    }

}
