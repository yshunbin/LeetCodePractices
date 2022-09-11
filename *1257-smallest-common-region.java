// https://leetcode.com/problems/smallest-common-region/

class Solution {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        Map<String, String> parents = new HashMap<>();
        Set<String> ancestor = new HashSet<>();
        
        for(List<String> region : regions) {
            for(int i=1; i<region.size(); i++){
                parents.put(region.get(i), region.get(0)); //(NYC:USA) or (OHIO:USA)
            }
        }
        while(region1 != null) {
            ancestor.add(region1);
            region1 = parents.get(region1);
        }
        while (!ancestor.contains(region2)){
            region2 = parents.get(region2);
        }
        return region2;
    }
}
//time & space: O(n) where n = total no. of regions
