class Solution {
    // Brute force | O(n^2) Time
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > max_sum) max_sum = sum;
            }
        }
        return max_sum;
    }

    // Kadane's Algorithm | O(n) Time
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int num : nums) {
            current_sum = Math.max(num, current_sum + num);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}