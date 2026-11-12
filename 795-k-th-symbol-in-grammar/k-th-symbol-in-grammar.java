class Solution {

    // Recursive helper function
    // n    -> current row number
    // k    -> position in the current row
    // flip -> keeps track of how many times the value has been flipped
    public int kthGrammarHelper(int n, int k, int flip) {

        // Base case:
        // Row 1 contains only one symbol: 0.
        // If flip count is even, return 0.
        // If flip count is odd, return 1.
        if (n == 1) {
            return flip % 2 == 0 ? 0 : 1;
        }

        // If k is even, the current symbol comes from the
        // right child of its parent. Right child is always
        // the flipped version of the parent, so increment flip.
        if (k % 2 == 0) {
            return kthGrammarHelper(n - 1, k / 2, flip + 1);
        }

        // If k is odd, the current symbol comes from the
        // left child of its parent. Left child remains the
        // same as the parent, so flip count is unchanged.
        return kthGrammarHelper(n - 1, (k + 1) / 2, flip);
    }

    public int kthGrammar(int n, int k) {
        // Start recursion with 0 flips
        return kthGrammarHelper(n, k, 0);
    }
}