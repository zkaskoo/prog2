
import java.util.ArrayList;
import java.util.List;

class MyUtils {
    
    private ArrayList<Integer> list = new ArrayList<Integer>();

    MyUtils(ArrayList<Integer> list) {
        
        this.list = list;
    }

    public void kiir() {
        for (int listelem : this.list) {
            System.out.println(listelem);
        }
    }

    public boolean equals (ArrayList list) {
        if (list.size() != this.list.size()) {
            return false;
        }

        for (int i = 0; i < list.size(); ++i) {
            if(list.get(i) != this.list.get(i)) {
                return false;
            }      
        }
        return true;
    }

    

    public void fill(int value) {
        for (int i = 0; i < this.list.size(); ++i) {
            this.list.set(i, value);
        }
    }

    public boolean isSorted() {
        if (this.list.isEmpty()){
            return false;
        }
        for (int i = 0; i < this.list.size() -1; ++i) {
            if (this.list.get(i) < this.list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public int getMin() {
        int min = 9999;

        for (int item : this.list) {
            
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public int getMax() {
        int max = -999;
        for (int item : this.list) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
    
}
