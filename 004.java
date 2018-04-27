class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int m = nums1.length, n=nums2.length;
        int i,j;//表示的是第几个，不是坐标
        int iMin=0,iMax=m,halfLen=(m+n+1)/2;
        while(iMin<=iMax){
            i=(iMin+iMax)/2;
            j=(m+n+1)/2-i;
            if(i>iMin&&nums1[i-1]>nums2[j])
                iMax=iMax-1;
            else if(i<iMax&&nums2[j-1]>nums1[i])
                iMin=iMin+1;
            else{
                int maxLeft;
                if(i==0) maxLeft = nums2[j-1];
                else if(j==0) maxLeft = nums1[i-1];
                else maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                
                if((m+n)%2==1) return maxLeft;
                int minRight;
                if(i==m) minRight = nums2[j];
                else if(j==n) minRight = nums1[i];
                else minRight = Math.min(nums2[j],nums1[i]);
                return (maxLeft+minRight)/2.0;
            }
        }
        return 0.0;
        
        
    }
}