class Solution {
    public int minMergedInteger(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i += 2) {
            String mergedStr = String.valueOf(nums[i]) + String.valueOf(nums[i + 1]);
            int mergedNum = Integer.parseInt(mergedStr);
            if (mergedNum < minVal) {
                minVal = mergedNum;
            }
        }
        return minVal;
    }
}
