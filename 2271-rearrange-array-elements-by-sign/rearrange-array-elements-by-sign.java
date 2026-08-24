class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Pointers for placing positive (even indices) and negative (odd indices) numbers
        int posIndex = 0;
        int negIndex = 1;
        
        // Standard for loop to iterate through the input array
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2; // Jump to the next even index
            } else {
                result[negIndex] = nums[i];
                negIndex += 2; // Jump to the next odd index
            }
        }
        
        return result;
    }
}