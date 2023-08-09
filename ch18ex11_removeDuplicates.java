import java.util.PriorityQueue;
import java.util.HashSet;

public class ch18ex11_removeDuplicates {

    public static void removeDuplicates(PriorityQueue<Integer> queue) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                newQueue.add(num);
            }
        }

        queue.clear();
        queue.addAll(newQueue);
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(7);
        queue.add(7);
        queue.add(8);
        queue.add(8);
        queue.add(8);
        queue.add(10);
        queue.add(45);
        queue.add(45);

        removeDuplicates(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }
}
