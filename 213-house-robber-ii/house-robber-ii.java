class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];          // single house, no adjacency issue
        return Math.max(robLinear(nums, 0, n - 2),   // exclude last house
                        robLinear(nums, 1, n - 1));  // exclude first house
    }

    // Classic House Robber I on the inclusive range [lo, hi]
    private int robLinear(int[] nums, int lo, int hi) {
        int prev2 = 0, prev1 = 0;   // dp[i-2], dp[i-1]
        for (int i = lo; i <= hi; i++) {
            int cur = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}