class Solution {
    public int myAtoi(String str) {
        if(str==null||str.length()==0)
            return 0;
        int ans = 0;
        int i=0;
        int sign = 1;
        while(str.charAt(i)==' '||str.charAt(i)=='\t'||str.charAt(i)=='\n')
            i++;
        if(str.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        else if(str.charAt(i)=='+')
            i++;
            
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            if(ans>Integer.MAX_VALUE/10||ans==Integer.MAX_VALUE/10 && str.charAt(i)>'7')
                return (sign>0)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            ans=ans*10+str.charAt(i)-'0';
            i++;
        }
        return ans*sign;
        
    }
}