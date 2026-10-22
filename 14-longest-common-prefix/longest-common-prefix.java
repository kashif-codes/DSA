
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Step 1: Sort the array in lexicographical (dictionary) order.
        // After sorting, the first and last strings will have the
        // maximum difference in their prefixes.
        Arrays.sort(strs);

        // Step 2: Store the first string after sorting.
        String str1 = strs[0];

        // Step 3: Store the last string after sorting.
        String str2 = strs[strs.length - 1];

        // Step 4: Initialize index to track matching characters
        // starting from the beginning of both strings.
        int index = 0;

        // Step 5: Compare characters at the same index in both strings.
        // Continue while index is within the length of str1.
        while (index < str1.length()) {

            // Check whether both strings have the same character
            // at the current index.
            if (str1.charAt(index) == str2.charAt(index)) {

                // If they match, move to the next character.
                index++;

            } else {

                // If they do not match, the common prefix ends here.
                break;
            }
        }

        // Step 6: Return the common prefix.
        // If index is 0, no common prefix exists, so return "".
        // Otherwise, return characters from index 0 up to index - 1.
        return index == 0 ? "" : str1.substring(0, index);
    }
}
