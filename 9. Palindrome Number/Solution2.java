class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = 0;
        int z = x;
        while (x / 10 != 0) {
            y = y * 10 + (x % 10);
            x /= 10;
        }
        y = y * 10 + (x % 10);
        return y == z;
    }
}