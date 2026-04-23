class Solution {
    public boolean canAliceWin(int[] nums) {
        int total=0;
        int single_digit=0;
        int double_digit=0;

        for(int i=0;i<nums.length;i++){
            total += nums[i];
        

        if(nums[i] < 10){
            single_digit += nums[i];
        }
        else{
            double_digit += nums[i];
        }
        }
        if(2 * single_digit > total){
            return true;
        }
        if(2 * double_digit > total){
            return true;
        }
        return false;
        
    }
}