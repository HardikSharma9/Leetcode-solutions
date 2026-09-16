import java.util.*;

class Solution {
    // Helper function to calculate total hours needed for a specific speed k
    public long funcn(int[] arr, long k) {
        long total_hours = 0;
        for (int p : arr) {
            // Ceiling division using long arithmetic
            total_hours += (long)(p + k - 1) / k;
        }
        return total_hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // Minimum speed is 1
        int high = 0;
        
        // Find the maximum pile size
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        long ans = high;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long hoursNeeded = funcn(piles, mid);
            
            if (hoursNeeded <= h) {
                // This speed works, try to find a smaller one
                ans = mid;
                high = (int) mid - 1;
            } else {
                // This speed is too slow, need to increase it
                low = (int) mid + 1;
            }
        }
        
        return (int) ans;
    }
}