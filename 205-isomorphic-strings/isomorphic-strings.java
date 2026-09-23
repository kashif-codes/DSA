import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {

        // HashMap stores the mapping:
        // character of s -> character of t
        HashMap<Character, Character> map =
            new HashMap<Character, Character>();

        // Traverse through both strings character by character
        for (int i = 0; i < s.length(); i++) {

            // If the current character of s is already present
            // in the map, it means we have seen this character before
            if (map.containsKey(s.charAt(i))) {

                // Check whether it is mapped to the same character
                // in t as before
                if (!map.get(s.charAt(i)).equals(t.charAt(i))) {

                    // Same character in s cannot map to
                    // different characters in t
                    return false;
                }

            } else {

                // s.charAt(i) is a new character.
                // Check if t.charAt(i) is already being used
                // as a value for another character.
                if (map.containsValue(t.charAt(i))) {

                    // Two different characters of s cannot
                    // map to the same character of t
                    return false;
                }

                // Create the new mapping
                // Example: a -> b
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        // If all characters follow a valid one-to-one mapping
        return true;
    }
}