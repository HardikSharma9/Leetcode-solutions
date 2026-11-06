import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start, 
                           List<Integer> current, List<List<Integer>> result) {
        // Base case: found a valid combination
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each candidate from 'start' index onwards
        for (int i = start; i < candidates.length; i++) {
            // Skip if candidate exceeds remaining
            if (candidates[i] > remaining) {
                continue;
            }

            // Choose the candidate
            current.add(candidates[i]);

            // Recurse — can reuse the same element (pass 'i', not 'i+1')
            backtrack(candidates, remaining - candidates[i], i, current, result);

            // Backtrack — remove the last choice
            current.remove(current.size() - 1);
        }
    }
}