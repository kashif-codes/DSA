class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        // if length is different they cannot be anagram
        if(m != n){
            return false;
        }else{
            // arraay to store frequency of 26 lowercase letter
            int[] count = new int[26];
            // add frequency of each character in s
            for(int i = 0; i < m; i++){
                // convert character to index
                count[s.charAt(i) - 'a']++;
            }
            // subtract  frequency of each chracter in t 
            for(int i = 0; i < n; i++){
                // convert character in to index and decrease it frequency
                count[t.charAt(i) - 'a']--;
            }
            // check if all frequencies become 0
            for(int i = 0 ; i < count.length; i++){
                // not zero means s and t have different frequencies
                if(count[i] != 0){
                    return false;
                }
            }
            // all frequencies are equal --> string are anagram
            return true;
        }
        
    }
}