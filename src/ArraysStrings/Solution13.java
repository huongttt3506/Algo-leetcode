package ArraysStrings;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/description/
public class Solution13 {
    public int romanToInt(String s) {
        int answer = 0;
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int val, preVal = - 1;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            val = romanMap.get(s.charAt(i));
            if (val < preVal) {
                answer -= val;
            } else {
                answer += val;
                preVal = val;
            }
        }
        return answer;
    }
    public int romanToInt2(String s) {
        int ans = 0;
        int num = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            switch (s.charAt(i)) {
                case 'I' : num = 1;
                break;
                case 'V' : num = 5;
                break;
                case  'X' : num = 10;
                break;
                case  'L' : num = 50;
                break;
                case 'C' : num = 100;
                break;
                case 'D' : num = 500;
                break;
                case 'M' : num = 1000;
                break;
            }
            if (num * 4 < ans) {
                ans -= num;
            } else ans += num;
        }
        return ans;
    }
}
