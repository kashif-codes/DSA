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
            // right Sum - nums[i] = sum of element after i
            if(leftSum == rightSum - nums[i]){
                return i;
            }
            // add current element from left
            leftSum += nums[i];
            // remove current element from right
            rightSum -= nums[i];
        }
        // if no pivot index is found
        return -1;
        
    }
}