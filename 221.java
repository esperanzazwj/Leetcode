class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int m=matrix.length,n=matrix[0].length;
        int[][] dp = new int[m][n];
        int maxlen=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    if(i==0||j==0)
                        dp[i][j]=1;
                    else
                        dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j-1]),dp[i-1][j])+1;
                    maxlen = Math.max(dp[i][j],maxlen);
                }
            }
        }
        return maxlen*maxlen;
    }
}