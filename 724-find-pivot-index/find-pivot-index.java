class Solution {
    public int pivotIndex(int[] nums) {
        // initial right sum 
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            // add current element to right sum
            rightSum += nums[i];
        }
        // initial leftSum
        int leftSum = 0;
        // check every index as possible
        for(int i = 0; i < nums.length; i++){
            // remove curent element from right side
            // because right side only contain element after i
            
            if(leftSum == rightSum - nums[i]){
                return i;
               
            }
            // add current element to left side 
             leftSum += nums[i];
             // remove current element from right side
            rightSum -= nums[i];
        }
        // if no valid index is found
        return -1;
        
        
    }
}