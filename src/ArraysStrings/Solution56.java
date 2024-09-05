package ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//https://leetcode.com/problems/merge-intervals/description/
public class Solution56 {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {7, 10}, {15, 18}};
        // sort intervals array
        // end = intervals[0][1];
        // while i < intervals.length
        // while (i+1 < length && intervals[i+1][0] > intervals[i][1]
        // if :  end = max(end, intervals[i+1][0];  i++
        // i = 0, i+1:  2 < 3  true, => 3 < 6 end = 6 => i++
        // i = 1:       8 < 6 && 6 < 10: false => [1, 6]
        // i = 2: ....
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        // case: intervals.length = 0
        if (intervals.length == 0) return new int[0][2];

        // intervals.length != 0:
        // 1. sort interval base on the first column (index 0)
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // 2. merge element arrays
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        int index = 0;
        while (index < intervals.length) {
            int[] range = new int[2];
            while (index < intervals.length && intervals[index][0] <= end) {
                start = Math.min(start, intervals[index][0]);
                end = Math.max(end, intervals[index][1]);
                index++;
            }
            range[0] = start;
            range[1] = end;
            list.add(range);

            if (index < intervals.length) {
                start = intervals[index][0];
                end = intervals[index][1];
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}