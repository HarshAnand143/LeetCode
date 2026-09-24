class Solution(object):
    def smallestIndex(self, nums):
        for i in range(len(nums)):
            x = nums[i]
            total = 0
            while x > 0:
                total += x % 10
                x //= 10
            if total == i:
                return i
        return -1