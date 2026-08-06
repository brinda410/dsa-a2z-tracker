class Solution {
    public static boolean isPalindrome(String s) {
         s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int  i=0;i<s.length()/2;i++){
            int n=s.length();
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
    }return true;
}
public static void main(String[]args){
    String s="A man,a plan,a canal:Panama";
    System.out.println(isPalindrome(s));
    }
}