class Solution {
    public int totalFruit(int[] fruits) {
        // store frequency in hashMap
        HashMap<Integer,Integer>map = new HashMap<>();
        //left pointer
        int left = 0;
        // max fruits we got
        int maxFruits = 0;
        
        // right pointer go through the array
        for(int right = 0; right < fruits.length; right++){
            // get the current character frequecy
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

        // map size becomes greater than 2 , remove leftmost part from window
        while(map.size() > 2){
           map.put(fruits[left],map.get(fruits[left])-1);
           
           // if frequency become 0 , remove it from hash map
           if(map.get(fruits[left]) == 0){
            map.remove(fruits[left]);
           }
           // left , move forward
           left++;
        }
        // current fruits tilln now we get
           int currFruits = right-left+1;
        // update max fruits 
           maxFruits = Math.max(maxFruits,currFruits);
        
        
        }
        // return maxFruits
        return maxFruits;
        
    }
}