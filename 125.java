class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0)
            return true;
        StringBuilder sb=new StringBuilder();
        String[] strArr = s.split("\\W");
        for(String i: strArr){            
            sb.append(i.toLowerCase());
        }
        String str1=sb.toString();
        String str2=sb.reverse().toString();
        return str1.equals(str2);
    }
}