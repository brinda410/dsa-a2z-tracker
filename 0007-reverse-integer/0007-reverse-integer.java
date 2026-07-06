class Solution {
    public int reverse(int x) {
        int n=x;
        int revNo=0;
        while(n!=0){
            int ld=n%10;
            if(revNo>Integer.MAX_VALUE/10 ||revNo<Integer.MIN_VALUE/10){
                return 0;
            }
            revNo=(revNo*10)+ld;
            n=n/10;
        }
        return revNo;
    }
}