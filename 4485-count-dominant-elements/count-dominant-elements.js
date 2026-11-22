var countDominantElements = function(nums) {
    const n = nums.length;
        if (n == 1) {
            return 1;
        }
        let count = 0;
        for (let i = 0; i < n; i++) {
            let sum = 0, neighbors = 0;
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
};