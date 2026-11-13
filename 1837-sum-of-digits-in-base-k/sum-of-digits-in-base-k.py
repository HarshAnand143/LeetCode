class Solution(object):
    def sumBase(self, n, k):
        total = 0
        while n > 0:
            total = n % k + total
            n //= k
        return total
