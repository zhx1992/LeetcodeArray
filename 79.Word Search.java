class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wd=word.toCharArray();
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[i].length;j++) {
                if(exist(board,i,j,wd,0))
                    return true;
            }
        return false;
    }
    private boolean exist(char[][] board,int i,int j,char[] wd,int m) {
        if(m==wd.length) return true;
        if(i<0||j<0||i==board.length||j==board[i].length) return false;
        if(board[i][j]!=wd[m]) return false;
        board[i][j]^=256;
        boolean exist=exist(board,i+1,j,wd,m+1)||
                      exist(board,i-1,j,wd,m+1)||
                      exist(board,i,j-1,wd,m+1)||
                      exist(board,i,j+1,wd,m+1);
        board[i][j]^=256;
        return exist;
    }
}