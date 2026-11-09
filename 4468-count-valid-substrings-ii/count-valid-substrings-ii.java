class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        long ans = 0;
        int lastA = -1;
        int lastAB = -1;
        int badStart = -1;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                lastA = i;
            } else if (ch == 'b') {
                if (lastA != -1) {
                    lastAB = Math.max(lastAB, lastA);
                }
            } else {
                if (lastAB != -1) {
                    badStart = Math.max(badStart, lastAB);
                }
            }
            ans += i - badStart;
        }
        return ans;
    }
}