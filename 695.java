class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0)
            return 0;
        int MaxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area=DFS(grid,i,j,0);
                    MaxArea=Math.max(MaxArea,area);
                }
            }
        }
        return MaxArea;
    }
    public int DFS(int[][] grid, int i, int j, int tmpArea){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=1)
            return tmpArea;
        grid[i][j]=0;
        tmpArea++;
        tmpArea=DFS(grid,i-1,j,tmpArea);
        tmpArea=DFS(grid,i+1,j,tmpArea);
        tmpArea=DFS(grid,i,j-1,tmpArea);
        tmpArea=DFS(grid,i,j+1,tmpArea);
        return tmpArea;
    }
}