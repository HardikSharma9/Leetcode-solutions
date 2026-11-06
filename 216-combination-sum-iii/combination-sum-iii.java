import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int target, List<Integer> current, List<List<Integer>> result) {
        // Base case: found a valid combination
        if (current.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {
            // Prune: if remaining target is too small or we don't have enough numbers left
            if (i > target) break; // since numbers are positive, no point continuing
            if (9 - i + 1 < k - current.size()) break; // not enough numbers remaining

            current.add(i);
            backtrack(i + 1, k, target - i, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }
}