package ArraysStrings;


import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/find-closest-number-to-zero/description/
public class Solution2239 {
    public int findClosestNumber(int[] nums) {
        int diffZeroMin;
        int answer = nums[0];
        diffZeroMin = Math.abs(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (diffZeroMin > Math.abs(nums[i])) {
                diffZeroMin = Math.abs(nums[i]);
                answer = nums[i];
            }
            else if (diffZeroMin == Math.abs(nums[i]) && nums[i] > answer) {
                answer = nums[i];
            }
        }
        return answer;
    }
    //[ -2, -1. 0., 1, 4]
    public int solution2(int[] nums) {
        int max = Integer.MAX_VALUE;
        for (int i : nums) {
            if (Math.abs(i) < Math.abs(max) || i == Math.abs(max)) {
                max = i;
            }
        }
        return max;
    }
}
