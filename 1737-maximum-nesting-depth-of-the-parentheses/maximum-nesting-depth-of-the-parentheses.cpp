class Solution {
public:
    int maxDepth(string s) {
        int maxdepth = 0;
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '(') {
                count++;
            }
            else if (s[i] == ')') {
                count--;
            }
            maxdepth = max(maxdepth, count);
        }
        return maxdepth;
    }
};