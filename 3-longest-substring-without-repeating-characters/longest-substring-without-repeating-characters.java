import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character>set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right<s.length();right++){
            // if duplicate is found, remove character
            // from the left until the duplicate is gone

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            // add new character
            set.add(s.charAt(right));

            // calculate current window length
            int currentLength = right-left+1;

            // update maximum length
            maxLength = Math.max(maxLength,currentLength);
        }
        return maxLength;


        
    }
}