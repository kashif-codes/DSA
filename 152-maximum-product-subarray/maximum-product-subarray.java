class Solution {
    public int maxProduct(int[] nums) {
        
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            // reset after encountering 0
            if(prefix == 0){

                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            // calculate product from left
            prefix *= nums[i];

            // calculate product from right
            suffix *= nums[nums.length-1-i];

            // take maximum from both side
            ans = Math.max(ans , Math.max(prefix,suffix));
        }
        return ans;
    }
}