class Solution(object):
    def minimumSumSubarray(self, nums, l, r):
        n = len(nums)
        ans = float('inf')
        for i in range(n):
            sum = 0
            for j in range(i, n):
                sum += nums[j]
                length = j - i + 1
                if length >= l and length <= r and sum > 0:
                    ans = min(ans, sum)
        if ans == float('inf'):
            return -1
        else:
            return ans