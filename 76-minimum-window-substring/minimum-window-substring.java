import java.util.HashMap;
class Solution {
    public String minWindow(String s, String t) {
         // store how many times each character is needed
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // store character frequencies inside current window 
        HashMap<Character,Integer>window = new HashMap<>();

        int left = 0;
        int right = 0;
        
        // number of different charcater whose required frequency is satisfied
        int formed = 0;

        // number of diffferent character we need to satisfy
        int require = map.size();

        //store the smallest window
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while(right < s.length()){

            // add character at right to the window
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);

            // if this chracter has the require frequencies
            if(map.containsKey(ch) && window.get(ch).equals(map.get(ch))){
                formed++;
            }
            // window is valid so try to shrink
            while(formed == require){

                // update minimum window
                if(right-left+1<minLength){
                    minLength = right - left +1;
                    start = left;
                }
                // remove left character
                char leftChar = s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);

                // if removing it makes the window invalid
                if(map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)){
                    formed--;
                }
                left++;
            }
            right++;
        }
        // no valid window found
        if(minLength == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLength);
        
    }
}