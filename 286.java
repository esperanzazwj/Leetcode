class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms==null||rooms.length==0||rooms[0].length==0)
            return;
        for(int i=0;i<rooms.length;i++)
            for(int j=0;j<rooms[0].length;j++)
                if(rooms[i][j]==0)
                    DFS(rooms,i,j,0);
        return;
    }
    public void DFS(int[][] rooms, int i, int j, int dist){
        if(i<0||j<0||i>=rooms.length||j>=rooms[0].length||rooms[i][j]<dist) return;
        rooms[i][j]=dist;
        DFS(rooms,i-1,j,dist+1);
        DFS(rooms,i+1,j,dist+1);
        DFS(rooms,i,j-1,dist+1);
        DFS(rooms,i,j+1,dist+1);
    }
}