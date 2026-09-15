class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroesCount = 0;

        // for right (traverse)
        for(int right = 0; right < nums.length; right++){
            // if we find zero count it
            if(nums[right] == 0){
                zeroesCount++;
            }
            // if zero is more than k , shrink the window
            while(zeroesCount > k){
                // if left element is zero , remove it from count
                if(nums[left] == 0){
                    zeroesCount--;
                    
                }
                left++;
            }
            // calculate current window length
            int currentLength = right - left + 1;
           
           // update max length
            maxLength = Math.max(maxLength , currentLength);
        }
        // return max Length
        return maxLength;
    }
}