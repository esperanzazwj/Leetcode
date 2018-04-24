class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return 0;
        int rows = matrix.length,cols = matrix[0].length;
        int[] heights=new int[cols];
        int maxArea=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                heights[j]=matrix[i][j]=='0'?0:1+heights[j];
            }
            maxArea = calcHistogram(heights,maxArea);
        }
        return maxArea;
    }
    public int calcHistogram(int[] heights,int maxArea){
        Stack<Integer> s = new Stack();
        for(int i=0;i<=heights.length;i++){
            int h = i==heights.length?0:heights[i];
            if(s.isEmpty()||h>=heights[s.peek()])//非常重要！！！！！
                s.push(i);
            else{
                int top = s.pop();
                maxArea = Math.max(maxArea,heights[top]*(s.isEmpty()?i:i-1-s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}