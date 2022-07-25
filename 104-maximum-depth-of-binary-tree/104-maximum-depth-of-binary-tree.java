class Solution {
    public int maxDepth(TreeNode root) {
        return (root == null ) ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
//recursion DFS: time - O(n), space - O(log(n))