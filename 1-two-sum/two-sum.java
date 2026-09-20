import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer , Integer>map = new HashMap<Integer,Integer>();
        
        // for first num
        for(int i = 0; i < nums.length; i++){
            // first num + second num/require num = target
            // target - first num = second num/require nnum

            int requireNum = target - nums[i];
            // check if require number is already exist
            if(map.containsKey(requireNum)){
                // return index of require num and currennt num index
              return  new int []  {map.get(requireNum),i};
            }
            // store current number and its index
            map.put(nums[i],i);
        }
        // return empty arrray if no pair is found
        return new int[]{};
        
        
    }
}