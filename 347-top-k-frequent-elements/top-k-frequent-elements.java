class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // create HashMap
        // key --> Number , value --> frequency
        HashMap<Integer,Integer>map = new HashMap<>();
        
        // count frequency of each element
        for(int i = 0; i < nums.length; i++){
            // if number exist , increase its frequency bt 1
            // if it does'nt exist , start frequency from 0 +1
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        // array to store the k most frequent element 
        int[] result = new int[k];
        
        // find the most frequent number k times
        for(int i = 0 ; i < k; i++){
            // store highest frequency
            int maxFreq = 0;
            //storing number having highest frequency
            int maxNum = 0;

            // map.keyset gives all the key(number) in the hashmap
            for(int num : map.keySet()){
                // get frequency of current number
                if(map.get(num) > maxFreq){
                    maxFreq = map.get(num);
                    //storing number having highest frequency
                    maxNum = num;
                }
            }
            // store most frequent number in result
            result[i] = maxNum;
            // remove it it cannot selected again
              map.remove(maxNum);
        
        }
        return result;
      
    }
}