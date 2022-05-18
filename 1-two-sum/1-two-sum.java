class Solution {
    public int[] twoSum(int[] nums, int target) { //nums = [3,2,4], target = 6
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) }; //[1,2]
            }
        }
        return null;
    }
}
//one-hash: time - O(n), space - O(n)
