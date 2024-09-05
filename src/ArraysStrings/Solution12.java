package ArraysStrings;

public  class Solution12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(4947));
    }
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] roman = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = {"M", "CM", "D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < roman.length; i++) {
            if (num / roman[i] > 0) {
                for (int j = 0; j < num/roman[i]; j++) {
                    sb.append(sym[i]);
                }
                num = num % roman[i];
            }
        }
        return sb.toString();




    }
}
