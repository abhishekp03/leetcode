class Solution {
    public void reverseString(char[] s) {
        recursiveFunc(s, 0, s.length - 1);
    }

    private void recursiveFunc(char[] s, int i, int j) {
        if (i >= j) return;
        else recursiveFunc(s, i+1, j-1);
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }
}