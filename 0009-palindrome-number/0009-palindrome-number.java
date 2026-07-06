class Solution {
    public boolean isPalindrome(int x) {
        int dupNo=x;
        int revNo=0;
        if(x<0){
            return false;
        }while(x>0){
            int ld=x%10;
            revNo=(revNo*10)+ld;
            x=x/10;

        }
        if(dupNo==revNo){
            return true;
        }else{
            return false;
        }
    }
}