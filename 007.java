class Solution {
    public int reverse(int x) {
        if(x==0)
            return 0;
        int abs_x = Math.abs(x);
        int ans = 0;
        int tmp = abs_x;
        
        while(tmp>0){
            int newans = ans*10+tmp%10;
            if((newans-tmp%10)/10!=ans)
                return 0;
            ans = newans;
            tmp/=10;
        }
        if(x<0)
            return -ans;
        else return ans;
    }
}