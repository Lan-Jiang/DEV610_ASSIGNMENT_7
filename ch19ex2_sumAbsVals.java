import java.util.Arrays;

public class ch19ex2_sumAbsVals {

    public static void main(String[] args) {
        int[] arr = {-1, 2, -4, 6, -9};
        int sum = sumAbsVals(arr);
        System.out.println(sum);
    }

    public static int sumAbsVals(int[] arr) {
        return Arrays.stream(arr)
                     .map(Math::abs)
                     .sum();
    }



}
