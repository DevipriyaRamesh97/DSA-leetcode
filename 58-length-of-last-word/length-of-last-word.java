class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int i=len-1;
        while(i>=0 && s.charAt(i)==' ')
            i--;
        int cnt=0;
        while(i>=0 && s.charAt(i)!=' '){
            cnt++;
            i--;
        }
        return cnt;
        
    }
}