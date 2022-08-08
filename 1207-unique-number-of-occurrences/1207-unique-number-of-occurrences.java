class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> noOccur = new HashMap();
        for (int num : arr) {
             noOccur.put(num, noOccur.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> unique = new HashSet(noOccur.values());
        //HashSet doesn't allow duplicates
        return noOccur.size() == unique.size();
    }
}
//hashmap, hashset: time - O(n), space O(n)