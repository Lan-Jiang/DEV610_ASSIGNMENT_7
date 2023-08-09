import java.util.HashSet;

public class HashIntSet {
    private HashSet<Integer> set;

    public HashIntSet() {
        set = new HashSet<>();
    }

    public void removeAll(HashIntSet otherSet) {
        for (int value : otherSet.set) {
            set.remove(value);
        }
    }

    // Other methods and main function (if needed) go here...

    public static void main(String[] args) {
        HashIntSet set1 = new HashIntSet();
        set1.add(-2);
        set1.add(3);
        set1.add(5);
        set1.add(6);
        set1.add(8);

        HashIntSet set2 = new HashIntSet();
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(8);
        set2.add(11);

        set1.removeAll(set2);

        System.out.println(set1);  // Output: [-2, 5]
    }
}
