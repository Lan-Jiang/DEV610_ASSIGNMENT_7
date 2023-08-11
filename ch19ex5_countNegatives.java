import java.util.Arrays;

public class ch19ex5_countNegatives {


    public static void main(String[] args) {
        int[] arr = {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6};
        long count = countNegatives(arr);
        System.out.println(count);
    }

    public static long countNegatives(int[] arr) {
        return Arrays.stream(arr)
                     .filter(num -> num < 0)
                     .count();
    }


}
