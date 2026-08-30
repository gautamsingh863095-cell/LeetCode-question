class Solution {
    public int[] concatWithReverse(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[2 * n];

        // Copy original array
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
        }

        // Copy reverse
        for (int i = 0; i < n; i++) {
            result[n + i] = nums[n - 1 - i];
        }

        return result;
    }
}