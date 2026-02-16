class Solution {
    public char findTheDifference(String s, String t) {
        int tlen=t.length();
        int slen=s.length();
        int exor=t.charAt(tlen-1);
        for(int i=0;i<slen;i++){
            exor=exor^s.charAt(i)^t.charAt(i);
        }
        return (char)exor;
        
    }
}