class Solution {
    public boolean validPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            int j=s.length()-1-i;
            if(s.charAt(i)!=s.charAt(j))
                return helper(s,i+1,j)||helper(s,i,j-1);
        }
        return true;
    }
    public boolean helper(String s, int start, int end){
        for(int i=start;i<=(start+end)/2;i++){
            if(s.charAt(i)!=s.charAt(end+start-i))
                return false;
        }
        return true;
    }
}