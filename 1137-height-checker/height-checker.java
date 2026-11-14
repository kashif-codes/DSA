import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        // copy if original array
        int [] copy = heights.clone();

        // sort the copy array 
        Arrays.sort(copy);
        // initially mismatch found
        int count = 0;

        for(int i = 0; i < heights.length;  i++){
            if(heights[i] != copy[i]){
                count++;
            }
        }
        return count;
        
    }
}