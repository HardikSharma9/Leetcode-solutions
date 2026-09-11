class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> curSubset = new ArrayList<>();
        allSubset(0, curSubset, finalAns, nums);
        return finalAns;
    }

    private void allSubset(int i, List<Integer> curSubset, List<List<Integer>> finalAns, int[] nums) {
        if (i == nums.length) {
            finalAns.add(new ArrayList<>(curSubset));
            return;
        }
        // Include
        curSubset.add(nums[i]);
        allSubset(i + 1, curSubset, finalAns, nums);
        // Exclude (backtrack)
        curSubset.remove(curSubset.size() - 1);
        allSubset(i + 1, curSubset, finalAns, nums);
    }
}