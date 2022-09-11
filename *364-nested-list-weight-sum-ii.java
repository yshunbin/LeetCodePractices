// https://leetcode.com/problems/nested-list-weight-sum-ii/
class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        Queue<NestedInteger> queue = new LinkedList<>();
        queue.addAll(nestedList);
        
        int d=1, maxDepth=0, sumOfElements=0, sumOfProducts=0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            maxDepth = Math.max(maxDepth, d);
            for(int i=0; i<size; i++){
                NestedInteger nested = queue.poll();
                if(nested.isInteger()){
                    sumOfElements += nested.getInteger();
                    sumOfProducts += nested.getInteger() * d;
                } else {
                    queue.addAll(nested.getList());
                }
            }
            d++;
        }
        return (maxDepth+1) * sumOfElements - sumOfProducts;
    }
}
//single pass bfs: time - O(n), space - O(n)
