class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        while(i < j){
            // left elements are already even
            if(nums[i] % 2 == 0 ){
                i++;
                
            }
            // right elements are already odd
            else if(nums[j] % 2 != 0 ){
                j--;
            
            // if left is odd and right is even then swap both pointer
                }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }
        return nums;
        
    }
}