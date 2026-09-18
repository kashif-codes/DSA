class Solution {
    public int[] runningSum(int[] nums) {
        // start from index 1 , because index 0 has no previous element
       for(int i = 1; i < nums.length; i++){
        // add previous element to the current element
        nums[i] = nums[i] + nums[i-1];
       }
       // modify array after calculating sum
       return nums;
        
    }
}