class Solution {
    public String maximumTime(String time) {
        char[] s = time.toCharArray();
        if (s[4] == '?') {
            s[4] = '9';
        }

        if (s[3] == '?') {
            s[3] = '5';
        }

        if (s[1] == '?') {
            if (s[0] == '?' || s[0] == '2') {
                s[1] = '3';
            } else {
                s[1] = '9';
            }
        }

        if (s[0] == '?') {
            if (s[1] - '0' < 4) {
                s[0] = '2';
            } else {
                s[0] = '1';
            }
        };
        return new String(s);
    }
}