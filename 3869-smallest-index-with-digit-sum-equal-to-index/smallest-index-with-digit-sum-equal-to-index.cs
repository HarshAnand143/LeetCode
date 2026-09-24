public class Solution {
    public int SmallestIndex(int[] nums) {
        for (int i = 0; i < nums.Length; i++) {
            int x = nums[i];
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}