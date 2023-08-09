import java.util.HashSet;

public class HashIntSet {
    private HashSet<Integer> set;

    public HashIntSet() {
        set = new HashSet<>();
    }

    public void addAll(HashIntSet s) {
        for (int value : s.set) {
            set.add(value);
        }
    }

    public static void main(String[] args) {
        HashIntSet set1 = new HashIntSet();
        set1.add(-5);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashIntSet set2 = new HashIntSet();
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(44);
        set2.add(79);

        set1.addAll(set2);

        System.out.println(set1);
    }
}
