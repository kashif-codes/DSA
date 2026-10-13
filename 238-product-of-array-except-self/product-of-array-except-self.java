
class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Stores the product of all elements to the LEFT of the current index.
        // Initially 1 because multiplying by 1 does not change a product.
        int leftProduct = 1;

        // Stores the product of all elements to the RIGHT of the current index.
        // Initially 1 for the same reason.
        int rightProduct = 1;

        // Store the length of the input array.
        int n = nums.length;

        // Create an output array to store the final answers.
        // ans[i] will contain the product of every element except nums[i].
        int[] ans = new int[n];

        // FIRST PASS: Calculate the product of elements to the LEFT.
        for (int i = 0; i < n; i++) {

            // Store the product of all elements BEFORE index i.
            // At i = 0, there are no elements on the left, so ans[0] = 1.
            ans[i] = leftProduct;

            // Include the current element in the product
            // so it can be used as a left element for the NEXT index.
            leftProduct *= nums[i];
        }

        // SECOND PASS: Calculate the product of elements to the RIGHT.
        // Traverse backward, starting from the last index.
        for (int i = n - 1; i >= 0; i--) {

            // ans[i] already contains the left product.
            // Multiply it by rightProduct to include all elements
            // to the RIGHT of the current index.
            ans[i] *= rightProduct;

            // Include the current element in the product
            // so it can be used as a right element for the PREVIOUS index.
            rightProduct *= nums[i];
        }

        // Return the completed array of products.
        return ans;
    }
}
