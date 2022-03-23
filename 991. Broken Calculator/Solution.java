class Solution {
    /*
        Backwards approach: Instead of subtracting 1 or multiplying 2 to startValue,
        greedily divide target by 2 if even else add 1 while target > startValue.
        Lastly, add the difference of startValue and target to result as it is the number of
        additions required to reach startValue.
    */
    public int brokenCalc(int startValue, int target) {
        int result = 0;
        while (target > startValue) {
            result += 1;
            if (target % 2 == 0) target /= 2;
            else target += 1;
        }
        return result + startValue - target;
    }
}