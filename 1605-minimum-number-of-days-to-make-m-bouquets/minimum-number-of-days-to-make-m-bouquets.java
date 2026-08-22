class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        // it means not enough flowers 
        if((long)m*k > bloomDay.length){
            return -1;
        }

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        // find maximum and minimum blooming day
        for(int day:bloomDay){
            start = Math.min(start,day);
            end = Math.max(end,day);
        }

        // binary search on the answer

        while(start < end){
            int mid = start +(end-start)/2;

            if(canMakeBouquets(bloomDay,m,k,mid)){
                end = mid; // try fewer days
            }else{
                start = mid+1;  // need more days
            }
        }
        return start;
        
    }
    private boolean canMakeBouquets(int[] bloomDay ,int m, int k, int day){
        int flower = 0;
        int bouquets = 0;

        for(int bloom:bloomDay){
            if(bloom <= day){  // it means flower is bloomed 
                flower++;      // count it

                if(flower == k){  // bloom flower i s equal to k , it means we can make bouquets
                    bouquets++;
                    flower = 0; // and another bouquets we again start counting flower
                }
            }else{
                flower =0;  // it means flower has not bloom , the consecutiv echain has broken
            }
        }
        return bouquets >= m;
    }
}