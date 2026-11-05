/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // If the tree is empty, there's no path
        if (root == null) {
            return false;
        }
        
        // If this is a leaf node, check if remaining sum matches its value
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        // Recursively check left and right subtrees
        // Subtract current node's value from targetSum
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || 
               hasPathSum(root.right, remainingSum);
    }
}