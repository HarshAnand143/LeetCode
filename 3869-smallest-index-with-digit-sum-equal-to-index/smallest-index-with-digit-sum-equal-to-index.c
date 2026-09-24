int smallestIndex(int* nums, int numsSize) {
    for (int i = 0; i < numsSize; i++) {
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