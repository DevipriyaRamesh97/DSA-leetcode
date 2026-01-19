class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] cnt = new int[1001];
        for(int i=0;i<nums1.length;i++){
            cnt[nums1[i]]=1;
        }
        for(int i=0;i<nums2.length;i++){
            if(cnt[nums2[i]]==1){
                cnt[nums2[i]]=2;
            }
        }
        int n=0;
        for(int i=0;i<1001;i++){
            if(cnt[i]==2){
                n++;
            }
        }
        int j=0;
        int[] res=new int[n];
        for(int i=0;i<1001;i++){
            if(cnt[i]==2){
                res[j++]=i;
            }
        }
        return res;
        
    }
}