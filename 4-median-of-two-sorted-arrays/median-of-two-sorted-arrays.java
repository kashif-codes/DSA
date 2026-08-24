class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // always binary search on the smaller array
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int start = 0;
        int end = m;

        while(start <= end){

            // partition of nums1
            int partitionX = (start + end)/2;

            // partition of nums2
            int partitionY = (m+n+1)/2 - partitionX;

            // left and right value of nums1
            int maxLeftX = (partitionX == 0)?Integer.MIN_VALUE:nums1[partitionX-1];

            int minRightX = (partitionX == m)?Integer.MAX_VALUE:nums1[partitionX];

            // left and right value of nums2
            int maxLeftY = (partitionY == 0)?Integer.MIN_VALUE:nums2[partitionY-1];
            int minRightY = (partitionY == n)? Integer.MAX_VALUE:nums2[partitionY];

            // correct partiton found
             if(maxLeftX <= minRightY && maxLeftY <= minRightX){

                // tottal lenght is even
                if((m+n)%2==0){
                    return (Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2.0;
                }

                // tottal length is odd
                else{
                    return Math.max(maxLeftX,maxLeftY);
                }

            }
            // we took too many elements from nums1
            else if(maxLeftX > minRightY){
                end = partitionX-1;
            }
            // we need more elements from nums1
            else{
                start = partitionX+1;
            }

        }
        return 0.0;
        
    }
}