var peakValleyDifference = function(nums) {
    let peakSum =0, valleySum = 0;
        for (let i = 1; i < nums.length -1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                peakSum += nums[i];
            }
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) {
                valleySum += nums[i];
            }
        }
        return peakSum - valleySum;
};
