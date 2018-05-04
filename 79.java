class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length==0||board[0].length==0)
            return false;
        boolean[][] used = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(helper(board,word,i,j,0,used))
                    return true;
            }
        return false;
    }
    public boolean helper(char[][] board, String word,int i,int j,int start,boolean[][] used){
        if(start==word.length())  return true;
        if (i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(board[i][j]!=word.charAt(start)||used[i][j])  return false;
        used[i][j]=true;
        boolean res=helper(board,word,i-1,j,start+1,used)||
            helper(board,word,i+1,j,start+1,used)||
            helper(board,word,i,j-1,start+1,used)||
            helper(board,word,i,j+1,start+1,used);
        used[i][j]=false;
        return res;
    }
   
}