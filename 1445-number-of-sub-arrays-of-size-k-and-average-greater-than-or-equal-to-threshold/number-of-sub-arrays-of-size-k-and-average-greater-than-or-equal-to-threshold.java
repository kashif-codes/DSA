class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 ;
        /* (formula) average = sum / element
        sum = average *element
        here , element k = 3 and average or threshold = 4 */
        int maxT = k * threshold;
        
        // sum of first window up to k
        for(int i = 0; i < k; i++){
            // add sum 
            sum += arr[i];
        }
        int count = 0;

        if(sum >= maxT){
            count++;
        }
        // start sliding window

        for(int i = k; i < arr.length; i++){
            // add new element
            sum += arr[i];
            // remmove old element leaving the window
            // i-k gives the index of leaving element
            sum -= arr[i-k];
        
        if(sum >= maxT){
            count++;

            }    
        }
        // return total count 
        return count;
        
    }
}