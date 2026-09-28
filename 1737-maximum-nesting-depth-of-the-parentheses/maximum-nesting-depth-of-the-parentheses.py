class Solution:
    def maxDepth(self, s: str) -> int:
        maxdepth = 0
        count = 0
        for i in range(len(s)):
            if s[i] == '(':
                count += 1
            elif s[i] == ')':
                count -= 1
            maxdepth = max(maxdepth, count)
        return maxdepth