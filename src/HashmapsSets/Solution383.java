package HashmapsSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/ransom-note/description/
public class Solution383 {
    //List
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magChar = new ArrayList<>();
        for (Character c : magazine.toCharArray()) {
            magChar.add(c);
        }
        for (Character c : ransomNote.toCharArray()){
            if (magChar.contains(c)) magChar.remove(c);
            else return false;
        }
        return true;
    }
    //HashMap
    public boolean solution2(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (charCount.getOrDefault(c, 0) == 0) return false;
            else charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }

}
