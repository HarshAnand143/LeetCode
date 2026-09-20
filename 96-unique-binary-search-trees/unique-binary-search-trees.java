class Solution {
    int ways(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += ways(i) * ways(n - 1 - i);
        }
        return sum;
    }
    public int numTrees(int n) {
        return ways(n);
    }
}