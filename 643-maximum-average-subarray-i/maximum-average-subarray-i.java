class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int n= nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
            int maxsum = sum;
            for(int i=k;i<n;i++){
                sum = sum - nums[i-k]+nums[i];
                maxsum = Math.max(sum, maxsum);
            }
        
        return (double) maxsum/k;
        
    }
}