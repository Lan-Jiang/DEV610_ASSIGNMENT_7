import java.util.Arrays;

public class ch19ex1_printDoubled {

    public static void main(String[] args) {
        int[] arr = {2, -1, 4, 16};
        printDoubled(arr);
    }

    public static void printDoubled(int[] arr) {
        Arrays.stream(arr)
              .mapToObj(x -> String.valueOf(x * 2))
              .forEach(str -> System.out.print(str + " "));
        System.out.println();
    }


}
