class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1 ;

        // check character from both side
        while(left < right){
            // if character are different
        if(s.charAt(left) != s.charAt(right)){

            // we can delete either left or right character
            return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
        }
            // move both pointer towards mid
            left++;
            right--;
        }
        return true;
        }
        // check if the given part of string is a palindrome
        public boolean isPalindrome(String s , int left,int right){

            while(left < right){
                // if chracter dont match ,its not palinndrome
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                // move pointer towards the middle
                left++;
                right--;
            }
            return true;

        }
        
    }
