class Solution {
    public int characterReplacement(String s, int k) {
        // left pointer
        int i = 0;
        // max Length
        int maxL = 0;
        // max Frequency
        int maxFreq = 0;
       
        // frequency array of 26 uppercase english letter
        int[] count = new int[26];
        // move the right pointer through array
        for(int j = 0 ; j < s.length(); j++){
            /// get the current chracter
            char c = s.charAt(j);
            // increase the frequency of current character
            count[c - 'A']++;
            // update maxFreq
            maxFreq = Math.max(maxFreq,count[c-'A']);
            
            // if cuurent length - maxFreq > k (invalid)
            // shrink the window , by removing the left character
            while((j-i+1)-maxFreq > k){
                // remove the leftmost charcater from the window
                count[s.charAt(i)-'A']--;
                // move left pointer forward
                i++;
            }
            // update maxL
            maxL = Math.max(maxL,(j-i+1));
        }
        // return maxL
        return maxL;
        
    }
}