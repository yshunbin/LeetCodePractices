class Solution {
    public boolean canJump(int[] nums) {
        int lastGood = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(i + nums[i] >= lastGood){
                lastGood = i;
            }
        }
        return lastGood == 0;
    }
}
//greedy back-tracking: time - O(n), space - O(1)