class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroesCount = 0;

        // for right
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroesCount++;
            }
            while(zeroesCount > k){
                if(nums[left] == 0){
                    zeroesCount--;
                    
                }
                left++;
            }
            int currentLength = right - left + 1;

            maxLength = Math.max(maxLength , currentLength);
        }
        return maxLength;
    }
}