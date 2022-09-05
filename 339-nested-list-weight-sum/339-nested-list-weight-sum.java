class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        Queue<NestedInteger> queue = new LinkedList<>();
        queue.addAll(nestedList);
        
        int d=1, total=0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                NestedInteger nested = queue.poll();
                if(nested.isInteger()) {
                    total += nested.getInteger() * d;
                } else {
                    queue.addAll(nested.getList());
                }
            }
            d++;
        }
        return total;
    }
}
//bfs: time - O(n), space - O(n)
