class Solution {
     public int minStartValue(int[] nums) {
         int minVal = 0;
         int total = 0;
         
         for (int num : nums) {
             total += num;
             minVal = Math.min(minVal, total);
         }
         //minVal + startVal = 1
         //startVal = -minVal + 1
         return -minVal + 1;
     }
}
//prefix total: time - O(n), space - O(1)

// class Solution {
//     public int minStartValue(int[] nums) {
//         int n = nums.length;
//         int m = 100;
        
//         int left = 1;
//         int right = m*n + 1;
        
//         while(left<right) {
//             int middle = (left+right)/2;
//             int total = middle;
//             boolean isValid = true;
            
//             for(int num : nums){
//                 total += num;
                
//                 if(total<1) {
//                     isValid = false;
//                     break;
//                 }
//             }
            
//             if(isValid) {
//                 right = middle;
//             } else {
//                 left = middle+1;
//             }
//         }
//         return left;
//     }
// }
//Binary Search: boundarys are 1 and mn+1, thus time - O(n * log(mn)), space - O(1)