class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        long total = (long)n * (n + 1) / 2;
        long bad = 0;
        int last = -1;
        for (int i = 2; i < n; i++) {
            if (s.charAt(i - 2) == 'a' && 
                s.charAt(i - 1) == 'b' && 
                s.charAt(i) == 'c') {
                last = i - 2;
            }
            if (last != -1) {
                bad += last + 1;
            }
        }
        return total - bad;
    }
}