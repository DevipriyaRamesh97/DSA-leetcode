class Solution {
    public int maximumCount(int[] nums) {
        int oddcnt=0;
        int evencnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                oddcnt++;
            }
            else if(nums[i]>0){
                evencnt++;
            }
        }
       return Math.max(oddcnt, evencnt);
    }
}