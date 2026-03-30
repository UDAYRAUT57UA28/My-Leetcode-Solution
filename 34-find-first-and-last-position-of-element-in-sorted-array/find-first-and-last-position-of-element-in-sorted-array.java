class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        if(n==0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                result[0] = i;
                break;
            }else{
                result[0] = -1;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                result[1] = i;
                break;
            }else{
                result[1] = -1;
            }
        }
        return result;
    }
}