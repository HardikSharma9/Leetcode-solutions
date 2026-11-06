class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));   // add a copy of current permutation
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue; // skip if number already used
            temp.add(nums[i]);                    // choose
            backtrack(result, nums, temp);        // explore
            temp.remove(temp.size() - 1);         // un-choose (backtrack)
        }
    }
}