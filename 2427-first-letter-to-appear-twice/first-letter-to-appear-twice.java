class Solution {
    public char repeatedCharacter(String s) {
        int cnt[]=new int[26];
     
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            cnt[idx]++;
            if(cnt[idx]==2)
               return s.charAt(i);
        }
        return ' ';
        
    }
}