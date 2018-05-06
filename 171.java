class Solution {
    public int titleToNumber(String s) {
        int n=0;
        for(int i=0;i<s.length();i++){
            n=n*26+(s.charAt(i)+1-'A');
        }
        return n;
    }
}