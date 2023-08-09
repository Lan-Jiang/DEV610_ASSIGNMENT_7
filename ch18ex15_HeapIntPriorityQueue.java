import java.util.Arrays;

public class HeapIntPriorityQueue {

    private int[] elements;
    private int size;


    public String toString() {
        int[] copy = Arrays.copyOf(elements, size);
        Arrays.sort(copy);

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < copy.length; i++) {
            result.append(copy[i]);
            if (i < copy.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");

        return result.toString();
    }

    public static void main(String[] args) {
        HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        queue.add(42);
        queue.add(50);
        queue.add(45);
        queue.add(78);
        queue.add(61);

        System.out.println(queue.toString());
    }
}
