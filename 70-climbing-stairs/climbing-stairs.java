class Solution {
    public int climbStairs(int n) {

        // If n is 0 or 1, there is only 1 way to reach the top
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev = 1, curr = 1;

        // Start from 2 because we already know the ways to reach step 0 and step 1
        for (int i = 2; i <= n; i++) {

            int temp = curr;

         // Number of ways to reach the current step = ways to reach the previous step + ways to reach two steps before
            curr = prev + curr;

            // Move prev forward for the next iteration
            prev = temp;
        }

        // curr contains the total number of ways to reach step n
        return curr;
    }
}