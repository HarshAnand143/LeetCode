var sumCounts = function(nums) {
    let n = nums.length;
    let res = 0;
    for (let i = 0; i < n; i++) {
        let s = new Set();
        for (let j = i; j < n; j++) {
            s.add(nums[j]);
                res += s.size * s.size;
            }
        }
        return res;
};
