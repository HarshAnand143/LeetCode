int removeDuplicates(int* nums, int numsSize) {
    if(numsSize == 0) return 0;
        int res = 1;
        for(int i = 1; i < numsSize; i++){
            if(nums[i] != nums[i - 1]){
            nums[res] = nums[i];
            res++;
            }
        }
        return res;
}