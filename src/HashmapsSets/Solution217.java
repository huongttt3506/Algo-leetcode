package HashmapsSets;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
    return nums.length != numsSet.size();
    }

}
