class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer lo, Integer hi) {
        if (node == null) return true;

        if (lo != null && node.val <= lo) return false; // must be > lower bound
        if (hi != null && node.val >= hi) return false; // must be < upper bound

        // Left subtree gets new upper bound = node.val
        // Right subtree gets new lower bound = node.val
        return validate(node.left, lo, node.val)
            && validate(node.right, node.val, hi);
    }
}