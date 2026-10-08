import java.util.HashMap;
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map = new HashMap<>();
        // prefix sum 0 , appears once before we start
        // this helps us to count subarray starting from index 0

        map.put(0,1);
       // initial sum
       // initial count of subarray
        int sum = 0;
        int count = 0;
        
        // traverse i through array
        for(int i = 0; i < nums.length; i++){
            // add current number to sum
            sum += nums[i];
            // sum1 + sum2 = goal
            // goal - sum2 = sum1


            int requireNum = sum - goal;
            
            // if requireNum is already in map , increase the count of requireNum
            if(map.containsKey(requireNum)){
                count += map.get(requireNum);
            }
            // store current prefix sum to the hashmap ;
            // if its exists increase its frequency
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        // return count4
        return count;
        
    }
}