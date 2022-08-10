class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> output = new ArrayList(); //[]
        int[] current = intervals[0];
        output.add(current); //[[a0, a1]]
        
        for(int[] interval : intervals) {
            int current_begin = current[0];
            int current_end = current[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if (current_end >= next_begin) {
                current[1] = Math.max(current_end, next_end);
            } else {
                current = interval;
                output.add(current);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}