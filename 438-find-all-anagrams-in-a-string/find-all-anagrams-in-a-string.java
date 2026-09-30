class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // store frequency of each character in p 
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            // add current character
            char ch = p.charAt(i);
            // increase frequency of ch
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // store frequency of each character of s
        HashMap<Character,Integer>window = new HashMap<>();
        // create arraylist to store index
        List<Integer>ans = new ArrayList<>();
        // left pointer
        int left = 0;
        // traverse right pointer
        for(int right = 0; right < s.length(); right++){
            // add current character
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
        
            // if size of window become larger than p.length()
            // decrease the size of window , by removinng character from left
            if(right - left +1 > p.length()){
                // character at left will be remove
                char remove = s.charAt(left);
                
                // if frequency becomes 0, remove it from HashMap
                window.put(remove,window.get(remove)-1);
                if(window.get(remove) == 0){
                    window.remove(remove);
                }
                // move left pointer forward
                left++;
            }
            // if window size is same 
            // and both frequency maps are equal
            // then current window is anagram
            if(right-left+1 == p.length() && window.equals(map)){
                // store starting index of anagram
                ans.add(left);

            }
        }
        // return ans
        return ans;


    }
}