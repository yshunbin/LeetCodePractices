// https://leetcode.com/problems/number-of-islands/

public class Solution {
    int nc; // height
    int nr; // width
       
    public int numIslands(char[][] grid) {      
        int c = 0; //count
        
        nr = grid.length;
        if (nr == 0) return 0;
        nc = grid[0].length;
        
        // iterate over entire grid
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    c++;
                }
            }
        }
        return c;
    }
    
    // i row, j column
    private void dfs(char[][] visited, int i, int j) {
        
        // check invalid indices and sites not land or is water
        if (i < 0 || i >= nr || j < 0 || j >= nc || visited[i][j] == '0') return;
        
        // mark the site as visited
        visited[i][j] = '0';
        
        // check all adjacent sites
        dfs(visited, i + 1, j);
        dfs(visited, i - 1, j);
        dfs(visited, i, j + 1);
        dfs(visited, i, j - 1);
    }
}

//DFS: time - O(cells), space - O(N)
