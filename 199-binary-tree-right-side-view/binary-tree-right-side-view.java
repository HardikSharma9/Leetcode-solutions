class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> my_q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        my_q.offer(root);
        while (!my_q.isEmpty()) {
            int size = my_q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = my_q.poll();
                if (i == size - 1) {
                    ans.add(temp.val);
                }
                if (temp.left != null) {
                    my_q.offer(temp.left);
                }
                if (temp.right != null) {
                    my_q.offer(temp.right);
                }
            }
        }
        return ans;
    }
}