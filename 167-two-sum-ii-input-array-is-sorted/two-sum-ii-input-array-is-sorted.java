class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            int sum = numbers[start]+numbers[end];

            // if sum is equal to target
            if(sum == target){
                return new int[]{start+1,end+1}; // plus one here because leetcode question asked to return 
                // 1-bassed indices 
            }
            // sum is too small --> move left forward
            else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
        
    }
}