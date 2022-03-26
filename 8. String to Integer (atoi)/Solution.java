import java.math.BigInteger;

class Solution {
    // Poor solution. Got correct result after 10+ submissions
    public int myAtoi(String s) {

        boolean isNegative = false;
        int idx = 0;
        String result = "";

        while (idx < s.length() && !isNumeric(s.charAt(idx))) {
            if (s.charAt(idx) == ' ') {
                idx++;
                continue;
            } else if (idx + 1 < s.length() && s.charAt(idx) == '+' && isNumeric(s.charAt(idx + 1))) {
                idx++;
                continue;
            } else if (idx + 1 < s.length() && s.charAt(idx) == '-' && isNumeric(s.charAt(idx + 1))) {
                isNegative = true;
                idx++;
            } else {
                return 0;
            }
        }

        while (idx < s.length() && isNumeric(s.charAt(idx))) {
            System.out.println(result);
            result += String.valueOf(s.charAt(idx) - '0');
            idx++;
        }

        System.out.print(result);

        if (result.length() == 0) return 0;

        if (isNegative) {
            result = "-" + result;
        }

        if (new BigInteger(result).compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) >= 0) {
            return Integer.MAX_VALUE;
        }

        if (new BigInteger(result).compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) <= 0) {
            return Integer.MIN_VALUE;
        }

        return new BigInteger(result).intValue();
    }

    private boolean isNumeric(char ch) {
        return ch - '0' >= 0 && ch - '0' <= 9;
    }
}