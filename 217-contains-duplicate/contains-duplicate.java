import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create HashSet to store number we have already seen
        HashSet<Integer>set = new HashSet<>();
      // traverse through the array
        for(int i = 0; i < nums.length; i++){
              // check if current is already in the set
            if(set.contains(nums[i])){
                // number is already exxist --> duplicate found 
                // return true;
                return true;
            }
            // add current number to remember it , to checck in future array
            set.add(nums[i]);
        }
        // if no duplicate 
        // return false
        return false;

        
    }
}