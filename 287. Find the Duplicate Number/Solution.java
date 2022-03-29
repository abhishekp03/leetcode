class Solution {
    public int findDuplicate(int[] nums) {
        // O(n) Time | O(1) Space
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}