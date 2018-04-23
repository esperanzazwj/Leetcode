class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i;
        for(i=0;i<bits.length-1;i++){
            if(bits[i]==1)
                i++;
        }
        return i==bits.length-1;
    }
}