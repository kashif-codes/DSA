class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // HashMap stores each 10 letter DNA sequence and its frequency
        HashMap<String,Integer>map = new HashMap<>();
        // list to store sequence that appear more than once
        List<String>ans = new ArrayList<>();
         
         // generate every possible 10 letter substring
        for(int i = 0; i <= s.length() - 10; i++){
            // get a substring of 10 length
            String str = s.substring(i,i+10);
            // increase the frequency 
            map.put(str,map.getOrDefault(str,0)+1);
           
           // if this sequence appear exactly two times add it to the answer
            if(map.get(str) == 2){
                ans.add(str);
            }
           
        }
        return ans;
    }
}