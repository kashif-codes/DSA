class Solution {
    public int pivotIndex(int[] nums) {
        // initial right sum
        int rightSum = 0;
        
        // for right Sum 
        for(int i = 0; i < nums.length; i++){
            // add current value to right sum
            rightSum += nums[i];
        }
        // initial leftSum
        int leftSum = 0;

        for(int i = 0; i < nums.length; i++){
            // 
            if(leftSum == rightSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return -1;
        
    }
}