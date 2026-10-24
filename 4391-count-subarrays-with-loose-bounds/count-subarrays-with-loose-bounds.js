var countSubarrays = function(nums, minK, maxK) {
    let left = 0;
    let count = 0;
    for(let i = 0; i < nums.length; i++){
        if(nums[i] < minK || nums[i] > maxK){
            left = i + 1;
        }
        else{
            count = count + i - left + 1;
        }
    }
   return count;
};