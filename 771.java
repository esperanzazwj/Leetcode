class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int cnt=0;
        for(int i=0;i<J.length();i++)
            set.add(J.charAt(i));
        for(int i=0;i<S.length();i++)
            if(set.contains(S.charAt(i))) cnt++;
        return cnt;
    }
}