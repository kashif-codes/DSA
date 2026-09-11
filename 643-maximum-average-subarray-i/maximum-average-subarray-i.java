class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // initial sum
         int sum = 0;
        
        
        // store the first window sum as the maximum
         for(int i = 0; i < k; i++){
            sum += nums[i];

         }
        int maxSum = sum;

        // slide the window through array
         for(int i = k; i < nums.length; i++){
            // add next element
            sum += nums[i];
            // remove previous element
            sum -= nums[i-k];
            
            // update maxSum
            maxSum = Math.max(maxSum , sum);
         }
         // return maxSum averge
         return (double)maxSum/k;

        
    }
}