import java.util.HashMap;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        // prefix su strat from 0
        int currSum = 0;
        // max Length
        int maxLength = 0;
        
        // if prefix sum becomes 0 at index i, 
        // length will be i - (-1) , so store 0 at index -1
        map.put(0,-1);
        
        // traverse loop
        for(int i = 0; i < nums.length; i++){
            // treat 0 as -1
            // and treat 1 as 1
             if(nums[i] == 0){
                currSum += -1;

            }else{
                currSum += 1;
            }
            // if prefix sum appeared before,
            // the subarray between the previous index and i 
            // jas equal number of 0 nad 1
            if(map.containsKey(currSum)){
                // current length
              int currLength = i - map.get(currSum);
              
              maxLength = Math.max(maxLength,currLength);
            // store only the first occurence of this prefix sum
            // becoz it gives the longest possible subarray
            }else{
                map.put(currSum,i);
            }
        }
        return maxLength;

        
    }
}