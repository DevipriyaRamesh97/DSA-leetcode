class Solution {
    public int missingNumber(int[] nums) {
       int XOR = nums.length;
       for(int i=0;i<nums.length;i++){
        XOR ^= i^nums[i];
       }
       return XOR;
        
    }
}