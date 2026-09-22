import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>set = new HashSet<>();
       // store all element of nums1
       for(int i = 0; i < nums1.length; i++){
        set.add(nums1[i]);
       }
       HashSet<Integer>result = new HashSet<>();
       // check which element of nums2 present in nums1
       for(int i = 0; i < nums2.length; i++){
        if(set.contains(nums2[i])){
            result.add(nums2[i]);

        }
       }
       // convert HashSet into int[]
       // create an integer array with same size hashset
       int[] ans = new int[result.size()];
       int i = 0;
       // take each element from hashset and store int the array
       for(int num : result){
        ans[i] = num;
        i++;
       }
       return ans;

        
    }
}