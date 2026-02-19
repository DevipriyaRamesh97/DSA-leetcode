class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int i=0,j=0,m=0,n=0;
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c)
           return mat;

        int res[][]=new int[r][c];
        for( i=0;i<row;i++){
            for(j=0;j<col;j++){
                res[m][n]=mat[i][j];
                n++;
                if(n==c){
                    m++;
                    n=0;
                }
            }
        }
        return res;
        
    }
}