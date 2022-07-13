class KthLargest {
    private static int k;
    private PriorityQueue<Integer> minHeap;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        
        for(int num : nums){
            minHeap.offer(num);
        }
        
        while(minHeap.size() > k) {
            minHeap.poll(); //get rid of min (0 index) element
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        while(minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
