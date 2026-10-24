class Solution {
public:
    int peakValleyDifference(vector<int>& nums) {
        int peakSum =0, valleySum = 0;
        for (int i = 1; i < nums.size() -1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                peakSum += nums[i];
            }
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) {
                valleySum += nums[i];
            }
        }
        return peakSum - valleySum;
    }
};