class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incLength = 1;
        int decLength = 1;
        int maxLength = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                incLength++;
                decLength = 1;
            } else if (nums[i + 1] < nums[i]) {
                decLength++;
                incLength = 1;
            } else {
                incLength = 1;
                decLength = 1;
            }
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }
        return maxLength;
    }
}
