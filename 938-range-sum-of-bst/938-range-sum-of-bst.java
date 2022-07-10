class Solution {
    private int sum; 
    
    public int rangeSumBST(TreeNode node, int low, int high) {
        sum = 0;
        dfs(node, low, high);
        return sum;
    }
    
    private void dfs(TreeNode node, int low, int high) {
        if(node == null) {
            return;
        }
        if(low <= node.val && node.val <= high) {
            sum += node.val;
        }
        if(low < node.val) {
            dfs(node.left, low, high);
        }
        if(high > node.val) {
            dfs(node.right, low, high);
        }
    }
}
//dfs recursive: time O(n), space O(n)