class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid==null|grid.length==0||grid[0].length==0)
            return 0;
        int peri=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) continue;
                peri+=4;
                if(i>0&&grid[i-1][j]==1) peri--;
                if(i<grid.length-1&&grid[i+1][j]==1) peri--;
                if(j>0&&grid[i][j-1]==1) peri--;
                if(j<grid[0].length-1&&grid[i][j+1]==1) peri--;
            }
        return peri;
    }
    
}