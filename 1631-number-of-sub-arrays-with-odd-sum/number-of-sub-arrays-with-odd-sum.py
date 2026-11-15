class Solution:
    def numOfSubarrays(self, arr: list[int]) -> int:
        MOD = 1000000007
        count = 0
        even = 1
        odd = 0
        prefix = 0
        for i in range (len(arr)):
            prefix += arr[i]
            if prefix % 2 == 0:
                count += odd
                even += 1
            else:
                count += even
                odd += 1
        return count % MOD