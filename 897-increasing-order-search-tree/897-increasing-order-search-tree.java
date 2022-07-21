class Solution {    
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inOrder(root, vals);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for(int v : vals){
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }
    
    public void inOrder(TreeNode node, List<Integer> vals){
        if(node == null) {
            return;
        }
        inOrder(node.left, vals);
        vals.add(node.val);
        inOrder(node.right, vals);
    }
}