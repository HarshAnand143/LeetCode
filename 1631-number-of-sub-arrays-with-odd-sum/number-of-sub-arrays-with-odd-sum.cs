public class Solution {
    public int NumOfSubarrays(int[] arr) {
        long MOD = 1_000_000_007;
        long count = 0;
        int even = 1;
        int odd = 0;
        long prefix = 0;
        for (int i = 0; i < arr.Length; i++) {
            prefix += arr[i];
            if (prefix % 2 == 0) {
                count += odd;
                even++;
            } else {
                count += even;
                odd++;
            }
        }
        return (int) (count % MOD);
    }
}