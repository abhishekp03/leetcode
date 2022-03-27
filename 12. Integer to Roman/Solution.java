class Solution {

    private String[] thousands = new String[] { "", "M", "MM", "MMM" };
    private String[] hundreds = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    private String[] tens = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    private String[] ones = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

    public String intToRoman(int num) {
        return thousands[num/1000] +
                hundreds[(num % 1000)/100] +
                tens[(num % 100) / 10] +
                ones[(num % 10)];
    }
}