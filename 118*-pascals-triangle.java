https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        // Base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        // If numRows is 2 or more
        for (int i=1; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            // If numRows 3 or more
            for (int j=1; j<i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
//dp: time - O(numRows^2) bc triangle updates 1+2+3+...+numRows times = numRows(numRows+1) / 2 times
//space - just triangle output thus O(1)
