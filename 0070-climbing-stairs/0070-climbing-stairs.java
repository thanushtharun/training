class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] a=new int[n+1];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        for(int i=3;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];

        }
        return a[n];

        
    }
}