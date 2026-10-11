
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Sum of the first k cards
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int maxSum = sum;

        // Replace cards from the left with cards from the right
        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - 1 - i];
            sum += cardPoints[n - 1 - i];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
