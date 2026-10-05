import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        // we use hashMap to check if we see the cumalative sum before
        HashMap<Integer,Integer>map = new HashMap<>();
        // prefix sum 0 appears once before we start
        // this helps us to count subarrays starting from index 0
        map.put(0,1);

        // current sum
        int sum = 0;
        int count = 0;

        // traverse through array
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            // sum 1 + require sum = k
            //sum 1 - k = require sum
            int requireSum = sum - k;

            if(map.containsKey(requireSum)){
                // if its exists , its frequency tells us
                // how many subarrays ending at current index having sum k
                count += map.get(requireSum);
            }
            // store current prefix summ in hashmap
            // if it already exists increase its frequency by  1,
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;

    }
}