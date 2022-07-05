class Solution {
    public TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        
        TreeNode left = invertTree(node.left);
        TreeNode right = invertTree(node.right);
        
        //swap
        node.right = left;
        node.left = right;
        
        return node;
     }
}

//recursive: time O(n), space O(n)