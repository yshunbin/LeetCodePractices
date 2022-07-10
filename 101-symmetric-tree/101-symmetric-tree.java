class Solution {
    public boolean isSymmetric(TreeNode node) {
        if (node == null) {
            return true;
        }
        
        return isSymmetric(node.left, node.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) 
            && isSymmetric(left.right, right.left);
    }
}
//recursive: time O(n), space O(n)