class Solution {
public:
    int countDominantElements(vector<int>& nums) {
        int n = nums.size();
        if (n == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0, neighbors = 0;
            if (i > 0) {
                sum += nums[i - 1];
                neighbors++;
            }
            if (i < n - 1) {
                sum += nums[i + 1];
                neighbors++;
            }
            if (nums[i] * neighbors >= sum) {
                count++;
            }
        }
        return count;
    }
};