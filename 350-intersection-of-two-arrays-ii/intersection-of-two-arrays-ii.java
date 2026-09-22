import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // hashmap store frequency of element
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();
        // count frequency of every element in nums1
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i] , map.getOrDefault(nums1[i],0)+1);
        }
        // use array list to store commonn element
        ArrayList<Integer> list = new ArrayList<>();
        // traverse nums2
        for(int i = 0; i < nums2.length; i++){
            // if any element of nums1 present in nums2 and its frequency is greater than 0
            // it means element exists
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                // add common element to the list
                list.add(nums2[i]);
              
              // decrease frequency after using the element
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        // convert arrayList <Integer> to array
        int[] ans = new int[list.size()];
        int i = 0;
        for(int num : list){
            ans[i] = num;
            i++;
        }
        return ans;
    }
}