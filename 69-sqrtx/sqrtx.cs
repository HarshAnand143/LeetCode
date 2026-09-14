public class Solution {
    public int MySqrt(int x) {
        int low = 0, high = x, ans = -1;
        while (low <= high) {
            long mid = (low + high) / 2;
            long midsq = mid * mid;
            if (midsq == x)
                return (int)mid;
            else if (midsq > x)
                high = (int)mid - 1;
            else {
                ans = (int)mid;
                low = (int)mid + 1;
            }
        }
        return ans;
    }
}