import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        String[] tomb = {"Auto, Bus, airplane"};
        ArrayList<String> names = new ArrayList<>(); //Array listnek nem  .lenght-el nezzuk meg a meretet hanem .size() -al.


        names.add("John");
        names.add("Jame");
        names.add("Alice");
        names.add("Mike");
        names.add("Bob");

        /* 
        //foreach 
        for(String jarmu : tomb) {
            System.out.println(jarmu);
        }

        System.out.println("-------------");

        //for ciklus
        for (int i = 0; i < tomb.length; ++i) {
            System.out.println("------");
        }

        //while ciklus

        int index = 0;
        while (index < tomb.length) {
            System.out.println(tomb[index]);
            index ++;

        }


        for(int i = 0; i < names.size(); ++i) {
            System.out.println(names.get(i));
        }

        int index2 = 0;

        while (index2 < names.size()) {
            System.out.println(names.get(index));
            index2++;
        }
        */
        names.forEach(name -> System.out.println(name));
        System.out.println("-------");
        names.set(0, "Zoli");
        names.forEach(name -> System.out.println(name));
        names.remove(0);
        names.forEach(name -> System.out.println(name));

        System.out.println(names.contains("Mike"));
        System.out.println(names.indexOf("Bob"));
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names.isEmpty());
    }
}