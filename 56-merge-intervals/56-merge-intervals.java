class Solution {
    public int[][] merge(int[][] intervals) {
        //sort 
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        //merged LinkedList: list of arrays
        LinkedList<int[]> merged = new LinkedList<>();
            for(int[] interval : intervals) {
            // if merged LinkedList is empty or if the current interval does not overlap, append it
                if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                    merged.add(interval);
                }
            // otherwise, if overlapped, merge the two intervals.
                else {
                    merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
                }
            }
        //return convert LinkedList toArray
        return merged.toArray(new int[merged.size()][]);
    }
}