import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int  getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNameFromListById(List<Item> items, Integer id) {

        for (Item item: items) {
            
            if (item.id == id) {
                return item.name;
            } 
        }
        return "";
    }

    @Override
    public String toString() {
        return String.format("%d: %s", this.id, this.name);
    }


}
public class Main {

    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("lines.txt");
        List<Item> items = new ArrayList<>();

        // for (String line: lines) {
        //     System.out.println(line);
        // }

        lines.remove(0);
        for (String line: lines) {
            String[] value = line.split(",");
            Integer id = Integer.parseInt(value[0]);
            String name = value[1];
            items.add(new Item(id, name));


        }

        for (Item line: items) {
            System.out.print(line);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy id-t: ");
        int id = sc.nextInt();
        System.out.println("Targy neve: " + Item.getNameFromListById(items, id));
    }
}
