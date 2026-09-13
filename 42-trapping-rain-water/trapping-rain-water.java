class Solution {
    public int trap(int[] height) {
      
         // total amount of water trapped
        int water = 0;
        // start from second element 
        int left = 1;
        // start from second last element
        int right = height.length -2;
        
        // maximum height seen from left side
        int leftMax = height[0];
        // maximum height seen from right side
        int rightMax = height[height.length-1];
        
        // process element from both side
        while(left <= right){
            // update maximum height from left
            leftMax = Math.max(leftMax , height[left]);
            // update maximum height from right 
            rightMax = Math.max(rightMax,height[right]);

            /* if rightMax is smaller , then water at right
            depends on rightMax */

            if(rightMax < leftMax){
                // water trapped at right position
                water += rightMax - height[right];
                // move right pointer toward left
                right--;
            }else{
                /* if leftMax is smaller , then water at right
            depends on lefttMax */
                water += leftMax - height[left];
                // move left pointer towards right
                left++;
            }
        }
        return water;
        
    }
}
