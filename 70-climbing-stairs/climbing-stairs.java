class Solution {
    public int climbStairs(int n) {
       if(n==1) return 1;
       if(n==2) return 2;


        int first=1;
        int sec=2;
        for(int i=3;i<=n;i++){
       
        int next=first+sec;
        first=sec;
        sec=next;
        }
        return sec;
    }
}