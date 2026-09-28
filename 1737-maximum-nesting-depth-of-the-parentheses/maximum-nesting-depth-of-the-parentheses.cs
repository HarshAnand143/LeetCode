public class Solution {
    public int MaxDepth(string s) {
        int maxdepth = 0;
        int count = 0;
        for (int i = 0; i < s.Length; i++) {
            if (s[i] == '(') {
                count++;
            }
            else if (s[i] == ')') {
                count--;
            }
            maxdepth = Math.Max(maxdepth, count);
        }
        return maxdepth;
    }
}