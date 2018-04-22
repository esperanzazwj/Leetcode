class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i=0,j=height.length-1;
        while(i<j){
            if(height[i]<=height[j]){
                maxArea = Math.max(maxArea,(j-i)*height[i]);
                i++;
            }
            else
            {
                maxArea = Math.max(maxArea,(j-i)*height[j]);
                j--;
            }
        }
        return maxArea;
    }
}