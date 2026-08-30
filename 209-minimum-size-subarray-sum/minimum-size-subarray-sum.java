class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;  // left pointer
        int sum = 0; // current window
        int minLength = Integer.MAX_VALUE;

        // traverse j 
        for(int j = 0; j < nums.length; j++){
            // add current element to window
             sum += nums[j];

            while(sum >= target){
                // calculate current window length
              int length = j - i + 1;
              
              // store minimum length
              minLength = Math.min(minLength,length);
             
             // remove leftmost element
              sum -= nums[i];
              // move left pointer
              i++;
            }
        }
        // if no valid subarray is found
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;

        
    }
}