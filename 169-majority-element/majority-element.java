import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int p=nums.length/2;
        return nums[p];
    }
}