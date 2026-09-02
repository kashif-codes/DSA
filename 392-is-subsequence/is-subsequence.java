class Solution {
    public boolean isSubsequence(String s, String t) {
        // if s is empty is always subsequnec of t
        if(s.length() == 0){
            return true;
        }
        // two pointer
        int i = 0; // i for string s
        int j = 0; // j for string t

       // continue until we reach end of either side
        while(i < s.length() && j < t.length()){
            // if charcter is same we need to find next character
            // so increament both i and j
            if(s.charAt(i) == t.charAt(j)){
               i++;
               j++;
               // if not found then move j 
            }else{
                j++;
            }
            // if i reaches the end of s it means all character of s sstring are found in t string
            if(i == s.length()){
                return true;
            }
        }
        // if not then return false
        return false;
    }
}