class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1; // last elements of nums1 actual element
        int j = n-1; // last elements of nums2
        int k = m+n-1;  // last position of nums1

        // j>=0 it means check until j has element left
        // and fill elements from back in k.
        while(j >= 0){
            // if nums1 has element to check and nums1 has bigger element
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                // otherwise put nums2 element in k 
                nums1[k] = nums2[j];
                j--;
                k--;
            }

        }
    }
}