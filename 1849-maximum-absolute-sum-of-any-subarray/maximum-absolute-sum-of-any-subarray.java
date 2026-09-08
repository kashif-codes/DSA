class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // maximum sum at current index
        int currentMax = 0;
        // maximum sum found so far
        int maxSum = 0;
          
        // minimum sum at current index
        int currentMin = 0;
        // minimum sum found so far
        int minSum = 0;
        

        for(int i = 0; i < nums.length; i++){
            // kadane's algorithm
            // either start new subarray or continue previous subarray
            currentMax = Math.max(nums[i],nums[i] + currentMax);
            // update maximum sum 
            maxSum = Math.max(maxSum , currentMax);
            
            // reverse kadane's algorithm find most negative or  minimum
            currentMin = Math.min(nums[i] , currentMin + nums[i]);
            // update minimum sum
            minSum = Math.min(currentMin , minSum);
        }
        //compare both max sum and absoulte min sum 
        return Math.max(maxSum , Math.abs(minSum));
        
    }
}