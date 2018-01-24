package datastructures;

import java.util.HashMap;

public class Ransom {

    public static String canWeWriteOurRansomNote(String[] magazine, String[] ransomNote) {
        HashMap<String, Integer> wordHashMap = new HashMap<>();

        // If you have fewer words in your magazine you are never going to
        // be able to write the ransom note
        if(magazine.length < ransomNote.length)
        {
            return "No";
        }

        for (String word : magazine) {
            if (wordHashMap.containsKey(word)) {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word, 1);
            }
        }

        for (String word : ransomNote) {
            if (!wordHashMap.containsKey(word)) {
                return "No";
            }

            int count = wordHashMap.get(word) - 1;
            if (count == 0) {
                wordHashMap.remove(word);
            } else {
                wordHashMap.put(word, count);
            }
        }

        return "Yes";
    }
}
