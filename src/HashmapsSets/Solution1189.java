package HashmapsSets;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/maximum-number-of-balloons/description/
public class Solution1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if ( c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n')
                map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char[] chars = {'b', 'a', 'l', 'o', 'n'};
        int[] count = {1, 1, 2, 2, 1};
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            int val = map.getOrDefault(chars[i], 0);
            if (val == 0) return 0;
            else {
                ans = Math.min(ans, val/count[i]);
            }
        }
        return ans;


    }
    public int Solution2(String text) {
        int ans = Integer.MAX_VALUE;
        //char[] chars = {'b', 'a', 'l', 'o', 'n'};
        int[] countChar = new int[5];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') countChar[0]++;
            if (text.charAt(i) == 'a') countChar[1]++;
            if (text.charAt(i) == 'l') countChar[2]++;
            if (text.charAt(i) == 'o') countChar[3]++;
            if (text.charAt(i) == 'n') countChar[4]++;
        }
        countChar[2] /= 2;
        countChar[3] /= 2;
        for (int i = 0; i < 5; i++) {
            if (countChar[i] == 0) return 0;
            else {
                ans = Math.min(ans, countChar[i]);
            }
        }
        return ans;
    }

}
