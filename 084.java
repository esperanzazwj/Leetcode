class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights==null||heights.length==0)
            return 0;
        Stack<Integer> stack = new Stack();
        int res=0;
        for(int i=0;i<=heights.length;i++){
            int h = (i == heights.length ? 0 : heights[i]);
            if(stack.isEmpty()||h>=heights[stack.peek()])
                stack.push(i);
            else{
                int tmp=stack.pop();
                res = Math.max(res,heights[tmp]*(stack.isEmpty()?i:i-1-stack.peek()));
                i--;
            }
        }
        return res;
    }
}