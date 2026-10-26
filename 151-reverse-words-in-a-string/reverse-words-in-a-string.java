class Solution {
    public String reverseWords(String s) {
        // convert string into word of array
        String[] words = s.split(" +");
        // create stringbuilder it help us modify string without creating new string
        StringBuilder sb = new StringBuilder();
        
        // reverse loop
        for(int i = words.length-1; i >= 0; i--){
            // gett current word
            sb.append(words[i]);
            // get space after onne word
            sb.append(" ");
        }
        /// convert back into string 
        // use trim to remove extra spaces
        return sb.toString().trim();
        
    }
}