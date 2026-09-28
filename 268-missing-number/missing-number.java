class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {          // candidate number
            boolean found = false;
            for (int num : nums) {              // search in array
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;               // this one is missing
        }
        return -1; // never reached
    }
}