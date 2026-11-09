class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        int n = s1.length();
        int i = 0;
        while (i < n) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
                continue;
            }
            int j = i;
            while (j < n && s1.charAt(j) != s2.charAt(j)) {
                j++;
            }
            ans.add(Arrays.asList (s1.substring(i, j), s2.substring(i, j)));
            i = j;
        }
        return ans;
    }
}
