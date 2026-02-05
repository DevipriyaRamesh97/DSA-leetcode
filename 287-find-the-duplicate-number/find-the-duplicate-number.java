class Solution {
    public int findDuplicate(int[] nums) {
        int res[]=new int[10000001];

        for(int i=0;i<nums.length;i++){
            res[nums[i]]++;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>1){
                    return i;
                }
            }
        return -1;
    }
}
        
    
