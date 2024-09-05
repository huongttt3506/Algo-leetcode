package HashmapsSets;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/description/
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

    }
    public boolean solution2(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCountMap.containsKey(c)) return false;
            else charCountMap.put(c, charCountMap.get(c) - 1);

            if (charCountMap.get(c) < 0) return false;
        }
        return true;
    }
}
