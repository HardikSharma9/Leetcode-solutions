/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> my_q= new LinkedList<>();
        int ans=root.val;
        my_q.offer(root);
        while(!my_q.isEmpty()){
          int size=my_q.size();
            
            for(int i=0;i<size;i++){
               TreeNode temp=my_q.poll();
               if(i==0)ans=temp.val;
               if(temp.left!=null)my_q.offer(temp.left);
                if(temp.right!=null)my_q.offer(temp.right);
            
        }
        }
        return ans;
            
    }
}