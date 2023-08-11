public class ch19ex7_countVowels {

    public static void main(String[] args) {
        String input = "SOO beautiful";
        long vowelCount = countVowels(input);
        System.out.println(vowelCount);
    }

    public static long countVowels(String str) {
        return str.chars()
                  .map(Character::toLowerCase)
                  .filter(ch -> "aeiou".indexOf(ch) >= 0)
                  .count();
    }


}
