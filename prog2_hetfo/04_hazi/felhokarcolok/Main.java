public class Main {
    
    public static void main(String[] args) {
        int szam = 21024;
        
        String szamStr = Integer.toString(szam);
        
        int[] felhokarcolok = new int[szamStr.length()];
        
        for (int i = 0; i < szamStr.length(); i++) {
            felhokarcolok[i] = Character.getNumericValue(szamStr.charAt(i));
        }
        
        int kulonbsegekOsszege = 0;
        for (int i = 0; i < felhokarcolok.length - 1; i++) {
            kulonbsegekOsszege += Math.abs(felhokarcolok[i] - felhokarcolok[i + 1]);
        }
        
        System.out.println("A szomszédos felhőkarcolók magasságkülönbségeinek összege: " + kulonbsegekOsszege);
    }
}
