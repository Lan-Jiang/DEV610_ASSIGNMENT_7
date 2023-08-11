import java.util.stream.Collectors;

public class ch19ex8_toSortedForm {

    public static void main(String[] args) {
        String input = "tennessee";
        String sortedForm = toSortedForm(input);
        System.out.println(sortedForm); // Output: Sorted form: eeeennsst
    }

    public static String toSortedForm(String str) {
        return str.chars()
                  .mapToObj(c -> (char) c)
                  .sorted()
                  .map(Object::toString)
                  .collect(Collectors.joining());
    }


}
