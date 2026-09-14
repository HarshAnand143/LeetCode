class Solution {
public:
    int mySqrt(int x) {
        int low = 0, high = x, ans = -1;
        while (low <= high) {
            long long mid = (low + high) / 2;
            long long midsq = mid * mid;
            if (midsq == x)
                return mid;
            else if (midsq > x)
                high = mid - 1;
            else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
};