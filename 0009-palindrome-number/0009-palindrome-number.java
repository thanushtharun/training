class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;int t=x;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        if(t==rev){
            return true;
        }
    return false;

        
    }
}