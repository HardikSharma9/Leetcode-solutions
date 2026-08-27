import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // FIX 1: Handle empty array immediately
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int count = 1;
        int last_smaller = nums[0]; // FIX 2: Initialize with the first actual number

        // FIX 3: Loop should go up to length (not length-1) to process the last element
        for (int i = 1; i < nums.length; i++) {
            
            // FIX 4: Skip duplicates
            if (nums[i] == last_smaller) {
                continue; 
            }

            // FIX 5: Correct logic check
            // If current is exactly 1 greater than the last, extend sequence
            if (nums[i] == last_smaller + 1) {
                count++;
            } else {
                // Sequence broken, reset count
                count = 1;
            }
            
            // Update the last number seen
            last_smaller = nums[i];
            
            // Update max length
            longest = Math.max(longest, count);
        }
        
        return longest;
    }
}