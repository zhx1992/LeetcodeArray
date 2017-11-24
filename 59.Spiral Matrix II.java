class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int cur=1;
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;
        while(cur<=n*n) {
            int j=colStart;
            int i=rowStart;
            for(j=colStart;j<=colEnd;j++)
                res[rowStart][j]=cur++;
            rowStart++;
            for(i=rowStart;i<=rowEnd;i++)
                res[i][colEnd]=cur++;
            colEnd--;
            for(j=colEnd;j>=colStart;j--)
                res[rowEnd][j]=cur++;
            rowEnd--;
            for(i=rowEnd;i>=rowStart;i--)
                res[i][colStart]=cur++;
            colStart++;
        }
        return res;
    }
}