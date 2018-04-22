class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1 || numRows>=s.length())
            return s;
        if(numRows==0 || s=="")
            return "";
        int n = numRows*2-2;
        String[] result = new String[numRows];
        for(int i=0;i<s.length();i++){
            if(i%n<numRows)
                result[i%n] = (result[i%n]==null)?""+s.charAt(i):result[i%n]+s.charAt(i);
            else
                result[n-i%n] =(result[n-i%n]==null)?""+s.charAt(i):result[n-i%n]+s.charAt(i);
        }
        String ans = "";
        for(int i=0;i<numRows;i++){
            if(result[i]!=null)
                ans+=result[i];
        }
        return ans;
        
    }
}