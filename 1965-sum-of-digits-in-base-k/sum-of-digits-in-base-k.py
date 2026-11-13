class Solution:
    def sumBase(self, n: int, k: int) -> int:
        total = 0
        while n > 0:
            total = n % k + total
            n //= k
        return total