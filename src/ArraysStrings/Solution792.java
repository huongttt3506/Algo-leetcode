package ArraysStrings;
//https://leetcode.com/problems/number-of-matching-subsequences/description/
public class Solution792 {
    public int numMatchingSubSeq(String s, String[] words) {
        int count = 0;
        Solution792 sl = new Solution792();
        for (int i = 0; i < words.length ; i++) {
            if (sl.isSubSeq(s, words[i])) count++;
        }
        return count;

    }
    public boolean isSubSeq(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) == -1) return false;
            else t = t.substring(t.indexOf(s.charAt(i)) + 1);
        }
        return true;
    }

}
