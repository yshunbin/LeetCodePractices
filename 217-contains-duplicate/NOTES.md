```
class Solution {
public boolean containsDuplicate(int[] nums) {
for (int i=0; i<nums.length; i++) {
for (int j=0; j<i; j++) {
if (nums[j] == nums[i]) {
return true;
}
}
}
return false;
}
}
//linear search: time - O(n^2), space - O(1)
//time limit exceeded
​
class Solution {
public boolean containsDuplicate(int[] nums) {
Arrays.sort(nums);
for (int i=0; i<nums.length; i++) {
if (nums[i] == nums[i+1]) {
return true;
}
}
return false;
}
}
//sorting: time - O(n log n), space - O(1)
```