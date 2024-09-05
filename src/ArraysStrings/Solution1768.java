package ArraysStrings;


//https://leetcode.com/problems/merge-strings-alternately/description/
public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        if (word1.length() <= word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                answer.append(word1.charAt(i)).append(word2.charAt(i));
            }
            answer.append(word2.substring(word1.length()));
        } else {
            for (int i = 0; i < word2.length(); i++) {
                answer.append(word1.charAt(i)).append(word2.charAt(i));
            }
            answer.append(word1.substring(word2.length()));
        }
        return answer.toString();
    }
}
