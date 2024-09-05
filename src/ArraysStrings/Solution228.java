package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        for (String str : summaryRanges(nums)) {
            System.out.println(str);

        }
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;

        int startIndex = 0, endIndex = 0;
        for (int i = startIndex; i < nums.length; i++) {
            StringBuilder str = new StringBuilder();
            str.append(nums[startIndex]);
            endIndex = startIndex;
            while (i + 1 < nums.length && nums[i+1] == nums[i] + 1) {
                i++;
                endIndex = i;
            }
            if (endIndex > startIndex) {
                str.append("->").append(nums[endIndex]);
                startIndex = endIndex + 1;
            }
            startIndex = endIndex + 1;
            ans.add(str.toString());
        }

        return ans;
    }

}
