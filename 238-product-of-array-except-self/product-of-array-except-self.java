class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < nums.length; i++){
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }
        for(int i = n-1; i >= 0; i--){
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return ans;
        
    }
}