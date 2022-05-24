class Solution {
    //[[0,0],[2,0],[1,1],[2,1],[2,2]]
    public String tictactoe(int[][] moves) {
        int n = 3; //size of board
        
        int[] rows = new int[n], cols = new int[n]; //record values of rows and cols
        int diag = 0, anti_diag = 0; //diag \, anti_diag /
        
        int player = 1; //player1 = 1, player2 = -1
        
        for (int[] move : moves) {
            
            int row = move[0], col = move[1]; //get row and col num
            
            rows[row] += player;
            cols[col] += player;
            
            if(row == col){ //[0,0] or [1,1] or [2,2]
                diag += player;
            }
            if(row+col == n-1) { //[0,2] or [1,1] or [2,0]. aka n-1=2
                anti_diag += player;
            }
            if(Math.abs(rows[row]) == n ||
               Math.abs(cols[col]) == n ||
               Math.abs(diag) == n ||
               Math.abs(anti_diag) == n) {
                return player == 1 ? "A" : "B"; 
            }
            
            //if no one wins
            player *= -1;
        }
        //all moves done. if grid full draw/pending
        return moves.length == n*n ? "Draw" : "Pending";
    }
}