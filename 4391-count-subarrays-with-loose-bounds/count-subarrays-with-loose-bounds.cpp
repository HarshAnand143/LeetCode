class Solution {
public:
    long long countSubarrays(vector<int>& nums, int minK, int maxK) {
        int left = 0;
        long long count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                left = i + 1;
            } else {
                count += i - left + 1;
            }
        }
        return count;
    }
};