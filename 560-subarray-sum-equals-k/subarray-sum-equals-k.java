import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store prefixSum -> frequency
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        
        // Initialize with (0, 1) to handle subarrays starting from index 0
        prefixSumCount.put(0, 1);
        
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            // Update current prefix sum
            currentSum += num;
            
            // If (currentSum - k) exists in map, add its frequency to count
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }
            
            // Update the map with the current prefix sum
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}