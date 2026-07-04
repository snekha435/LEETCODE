import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count words in s1
        for (String word : s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Count words in s2
        for (String word : s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Store uncommon words
        List<String> ans = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}