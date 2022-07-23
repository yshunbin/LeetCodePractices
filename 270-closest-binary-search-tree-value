https://leetcode.com/problems/closest-binary-search-tree-value/

class Solution {
  public int closestValue(TreeNode node, double target) {
      int cur, closest = node.val;
      while(node != null) {
          cur = node.val;
          closest = Math.abs(cur - target) < Math.abs(closest - target) ? cur : closest;
          node = target < node.val ? node.left : node.right;
      }
      return closest;
  }
}
//binary search: time - O(h), space - O(1)
