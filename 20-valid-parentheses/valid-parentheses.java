
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse through every character in the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If the character is an opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {

                // Push it into the stack
                stack.push(ch);

            } else {

                // If stack is empty, no opening bracket exists
                if (stack.isEmpty()) {
                    return false;
                }

                // Get the most recent opening bracket
                char top = stack.pop();

                // Check whether the brackets match
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets are matched
        return stack.isEmpty();
    }
}