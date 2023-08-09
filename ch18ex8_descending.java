import java.util.PriorityQueue;

public class ch18ex8_descending {

    public static void descending(int[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        for (int num : arr) {
            priorityQueue.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = priorityQueue.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {42, 9, 22, 17, -3, 81};

        descending(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
