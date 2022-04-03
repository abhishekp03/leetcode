class Solution {
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;
        while (left >=0 && nums[left] >= nums[left + 1]) left--;
        if (left >=0) {
            int right = nums.length - 1;
            while (right > left && nums[left] >= nums[right]) right--;
            swap(nums, left, right);
        }
        reverse(nums, left+1, nums.length-1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}