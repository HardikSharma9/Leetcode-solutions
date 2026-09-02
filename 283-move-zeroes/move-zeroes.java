class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Points to the position of the first zero (or next spot for non-zero)
        
        for (int right = 0; right < nums.length; right++) {
            // If we find a non-zero element
            if (nums[right] != 0) {
                // Swap only if necessary (optimization: avoids writing to same index)
                if (left != right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                // Move the left pointer forward
                left++;
            }
        }
    }
}