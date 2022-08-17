class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));
        int count = 0;
        int result = 0;
        int diff = 0;
        for(int[] boxType : boxTypes) {
            if((count+boxType[0]) <= truckSize) {
                count += boxType[0];
                result += boxType[0] * boxType[1]; 
            }
            else {
                diff = (truckSize - count);
                result += diff * boxType[1];
                count += diff;
            }
        }
        return result;
    }
}