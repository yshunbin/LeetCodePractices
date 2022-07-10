class Solution {
    private int diameter;
    
    public int diameterOfBinaryTree(TreeNode node) {
        diameter = 0;
        longestPath(node);
        return diameter;
    }
    
    private int longestPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);
        
        diameter = Math.max(diameter, leftPath + rightPath);
        return Math.max(leftPath, rightPath) + 1;
    }
}
//dfs: time O(n), space O(n)