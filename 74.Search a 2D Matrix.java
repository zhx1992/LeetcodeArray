class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)
            return false;
        int m=matrix.length,n=matrix[0].length;
        int l=0,r=m*n-1;
        while(l<=r) {
            int mid=(l+r)/2;
            if(matrix[mid/n][mid%n]==target)
                return true;
            if(matrix[mid/n][mid%n]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}