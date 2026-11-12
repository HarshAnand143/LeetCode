class Solution(object):
    def longestMonotonicSubarray(self, nums):
        incLength = 1
        decLength = 1
        maxLength = 1
        for i in range(len(nums) - 1):
            if nums[i + 1] > nums[i]:
                incLength += 1
                decLength = 1
            elif nums[i + 1] < nums[i]:
                decLength += 1
                incLength = 1
            else:
                incLength = 1
                decLength = 1
            maxLength = max(maxLength, incLength, decLength)
        return maxLength