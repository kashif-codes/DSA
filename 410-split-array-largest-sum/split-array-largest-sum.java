class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
         
         // find start = maximmum element inn array
         // find end = sum of elements in array
         for(int i = 0; i< nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start <= end){
            int mid = start+(end-start)/2;
            
            // check if we can split the array 
            // such that no parts has sum > mid
            if(canSplit(nums,k,mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    private boolean canSplit(int[] nums,int k,int maxSum){
        int parts = 1; // we can start with one parts
        int currSum = 0; // store the sum of current parts

        for(int i = 0; i < nums.length; i++){
            if(currSum + nums[i] > maxSum){  // if adding nums[i] to currSum make greater than maxSum
                parts++;                    // then we need to add more parts
                currSum = nums[i]; // store the new parts with nums[i]
            }else{
                // else nums[i] can fit in the current part
                currSum += nums[i];
            }
        }
        // if require parts are <= k,
        //then max sum is possible
        return parts <= k;

    }
}