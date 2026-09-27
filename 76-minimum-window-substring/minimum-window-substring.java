class Solution {
    public String minWindow(String s, String t) {

        // Store frequency of characters required from t
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;

        // Number of characters from t that are currently satisfied
        int count = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // If ch is required, reduce its required frequency
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                // This character contributes to satisfying t
                if (map.get(ch) >= 0) {
                    count++;
                }
            }

            // Current window contains all characters of t
            while (count == t.length()) {

                // Update minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                // Put the left character back
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    // Window is no longer valid
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++;
            }

            right++;
        }

        // No valid window found
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}
  