import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        
        int longest = 1;
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int x = it;
                int count = 1;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}