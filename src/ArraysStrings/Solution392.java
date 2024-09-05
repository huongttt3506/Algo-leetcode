package ArraysStrings;


//https://leetcode.com/problems/is-subsequence/description/
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int i = 0;
        for (int j = 0; j < t.length() ; j++) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
                if (i == s.length()) return true;
            }
        }
        return false;
    }

    public boolean Solution2(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) == -1) return false;
            t = t.substring(t.indexOf(s.charAt(i) + 1));
        }
        return true;
    }
}
