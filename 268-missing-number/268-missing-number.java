class Solution { //[1, 3, 4] 4*5 / 2 = 10
    public int missingNumber(int[] nums) { //[0,1,3] = expectedSum 6
        int n = nums.length;
        int expectedSum = n*(n+1)/2; //if starts with 0
      //int expectedSum = [(nums.length+1)*(nums.length+2)]/2; if starts with 1
        int actualSum = 0;
        for (int num : nums) 
            actualSum += num;
        return expectedSum - actualSum;
    }
}
//gauss: time O(n), space O(1)