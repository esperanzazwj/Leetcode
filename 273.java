class Solution {
    private final String[] fig= new String[] {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    private final String[] teen= new String[] {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] ty= new String[] {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num){
        if(num==0) return "Zero";
        else return helper(num);
    }
    public String helper(int num){
        String res="";
        if(num<=10) res=fig[num];
        else if(num<20) res=teen[num-10];
        else if(num<100) res=ty[num/10-2]+" "+helper(num%10);
        else if(num<1000) res=fig[num/100]+" Hundred "+helper(num%100);
        else if(num<1000000) res=helper(num/1000)+" Thousand "+helper(num%1000);
        else if(num<1000000000) res=helper(num/1000000)+" Million "+helper(num%1000000);
        else res=helper(num/1000000000)+" Billion "+helper(num%1000000000);
        return res.trim();
    }
    
}