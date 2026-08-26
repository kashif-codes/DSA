class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start < end){

        
        
        // skip character that are not number and alphabet from left side
       while(start < end && ! Character.isLetterOrDigit(s.charAt(start))){
        start++;
       
       }
       // skip character that are not number and alphabet from right side
       while(start < end && ! Character.isLetterOrDigit(s.charAt(end))){
        end--;
       }

       // compare both character
       if(s.charAt(start) != s.charAt(end)){
        return false;
       }
       start++;
       end--;

    }
    return true;
    }
}