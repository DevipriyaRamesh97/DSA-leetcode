class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int LM[]=new int[len];
        int RM[]=new int[len];
        int max=0;
        int sum=0;
        for(int i=0;i<len;i++){
            max = Math.max(max, height[i]);
            LM[i] = max;
        }
        max=0;
          for(int i=len-1;i>=0;i--){
            max = Math.max(max, height[i]);
            RM[i] = max;
        }
        for(int i=0;i<len;i++){
            sum += Math.min(LM[i], RM[i]) - height[i];
        }
        return sum;
        
    }
}