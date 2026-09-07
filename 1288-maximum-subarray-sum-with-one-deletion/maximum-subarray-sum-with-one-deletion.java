class Solution {
    public int maximumSum(int[] arr) {

        // maximum sum before deleting any element
        int noDeletion = arr[0];
        // maximum sum after deleting one element
        int oneDeletion = Integer.MIN_VALUE /2;
         // maximum sum after comparing both
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            // normal kadane algorithm
            int newNoDeletion = Math.max(arr[i],arr[i] + noDeletion);
            
            /*two choice
            1. we alread delete an element --> add current element
            2. delete the current element --> use noDeletion */
            int newOneDeletion = Math.max(oneDeletion + arr[i] , noDeletion);
        
        // update both states
        noDeletion = newNoDeletion;
        oneDeletion = newOneDeletion;
        
        // find maximum answer
        maxSum = Math.max(maxSum , Math.max(noDeletion , oneDeletion));
        }
        return maxSum;
    }
}