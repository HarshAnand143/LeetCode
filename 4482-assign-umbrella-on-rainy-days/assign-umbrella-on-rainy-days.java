class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length, a = 0, b = 0;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            boolean alice = (i + 1 < n && rain[i] == 1 && rain[i + 1] == 1);
            boolean bob = (rain[i] == 1);
            if (alice && bob) {
                if (a <= b) {
                    ans[i] = "Alice";
                    a++;
                } else {
                    ans[i] = "Bob";
                    b++;
                }
            } else if (alice) {
                ans[i] = "Alice";
                a++;
            } else if (bob) {
                ans[i] = "Bob";
                b++;
            } else {
                ans[i] = "None";
            }
        }
        return ans;
    }
}