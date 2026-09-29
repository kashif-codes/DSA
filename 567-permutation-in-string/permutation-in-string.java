import java.util.HashMap;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // store the frequency of s1
        HashMap<Character,Integer>s1Map = new HashMap<>();
        for(int i = 0 ; i < s1.length(); i++){
            char ch = s1.charAt(i);
            s1Map.put(ch,s1Map.getOrDefault(ch,0)+1);
        }
        // store the frequency of s2
        HashMap<Character,Integer>map = new HashMap<>();
        // left pointer
        int i = 0;
        // right pointer
        int j = 0;
        
        // move the right pointer through s2
        while(j < s2.length()){
            // get current chracter
            char ch = s2.charAt(j);
            // add current chracter to window
            map.put(ch,map.getOrDefault(ch,0)+1);
           
            // check if window size == s1 length
            if(j-i+1 == s1.length()){
                // if current window is permutation of s1
                if(s1Map.equals(map)){
                    return true;
                }
                // get the character at the left side of window
                char left = s2.charAt(i);
                // decrease its frequency
                map.put(left,map.get(left)-1);
                
                // if frequency becomes 0 , remove it
                if(map.get(left) == 0){
                    map.remove(left);
                }
                // move i forward
                i++;
            }
            // move j forward
            j++;
        }
        return false;
        
    }
}