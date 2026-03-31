class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for(int num : nums){
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == (totalSum - leftsum - nums[i])) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}