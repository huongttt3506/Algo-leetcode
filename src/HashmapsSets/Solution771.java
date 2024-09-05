package HashmapsSets;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/jewels-and-stones/description/
public class Solution771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Set<Character> jSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jSet.add(jewels.charAt(i));

        }
        for (int i = 0; i < stones.length(); i++) {
            if (jSet.contains(stones.charAt(i))) ans++;
        }
        return ans;

    }
}
