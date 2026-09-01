import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer>set = new HashSet<>();
        // put nums1 elments in set
        for(int i = 0; i < nums1.length;i++){
            set.add(nums1[i]);
        }

        HashSet<Integer>result = new HashSet<>();

        // check nums2 element
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        // convert result hashsey into int[]
        int[] ans = new int[result.size()];
        int i = 0;

        Iterator<Integer>it = result.iterator();

        for(int j = 0; j<result.size();j++){
            ans[i] = it.next();
            i++;
        }
        
        return ans;
    }
}