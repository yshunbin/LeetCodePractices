class Solution {
    List<Integer> rightSide = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return rightSide;
        
        helper(root, 0);
        return rightSide;
    }
    
    private void helper(TreeNode node, int level){
        if(level == rightSide.size()) {
            rightSide.add(node.val);
        }
        if(node.right != null) {
            helper(node.right, level+1);
        }
        if(node.left != null) {
            helper(node.left, level+1);
        }
    }
}