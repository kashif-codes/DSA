class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
        int m = ransomNote.length();
        int n = magazine.length();
         int [] count = new int[26];
       // count all character available in magazine
        for(int i = 0; i < n ; i++){
            count[magazine.charAt(i)-'a']++;
        }
        // use letter needed by ransomNote
         for(int i = 0; i < m ; i++){
            count[ransomNote.charAt(i)-'a']--;
            // not enough of this letter
              if(count[ransomNote.charAt(i) - 'a'] < 0 ){
                return false;
        }
      
        }
        return true;
        
    }
}