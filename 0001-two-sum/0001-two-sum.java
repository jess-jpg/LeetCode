class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arrLen = nums.length;
        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}