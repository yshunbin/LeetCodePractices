class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll(); //get rid of right side
            if(root.right != null)
                queue.add(root.right);
            if(root.left != null)
                queue.add(root.left);
        }
        return root.val;
    }
}