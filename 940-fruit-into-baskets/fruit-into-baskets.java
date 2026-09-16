import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < fruits.length; right++){
           map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

           // more than two types of fruits

           while(map.size() > 2){

            // remove fruits at left
            map.put(fruits[left] , map.get(fruits[left])-1);

            // if count becomes 0, remove it from map

            if(map.get(fruits[left]) == 0){
                map.remove(fruits[left]);
            }
            left++;
           }
           // current window has at most 2 types
           maxLength = Math.max(maxLength , right-left + 1);
        }
        return maxLength;

        
    }
}