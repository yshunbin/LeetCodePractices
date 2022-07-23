class Solution {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inOrder(root);
        return ans.right;
    }
    
    public void inOrder(TreeNode node) { //in order LNR
        if (node == null) {
            return;
        }
        inOrder(node.left); //L
        node.left = null; 
        cur.right = node; //N
        cur = node; //keep moving cur to right
        inOrder(node.right); //R
    }
}
//in order BST: time - O(n), space - O(h) height of tree