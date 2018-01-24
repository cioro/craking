package datastructures;

public class Anagrams {

    // English lower case letters -> 26
    // Strings can have different sizes ->
    // Hashmap could be useful.

    public static int LETTERS = 26;

    public static int numberNeeded(String first, String second) {
        int[] firstCount = new int[LETTERS];
        int[] secondCount = new int[LETTERS];

        for (int i = 0; i < first.length(); ++i)
        {
            firstCount[first.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < second.length(); ++i)
        {
            secondCount[second.charAt(i) - 'a'] += 1;
        }

        int result = 0;

        for(int i = 0 ; i < LETTERS; ++i)
        {
            result += Math.abs(firstCount[i] - secondCount[i]);
        }

        return result;
    }
}
