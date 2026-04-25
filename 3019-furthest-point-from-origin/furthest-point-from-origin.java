class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                count1++;
            }
            else if(moves.charAt(i)=='R'){
                count2++;
            }
            else{
                count3++;
            }
        }
        return Math.abs(count1-count2)+count3;

        
    }
}