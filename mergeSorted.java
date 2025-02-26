// Time Complexity:  O(m+n)
// Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int put = m + n - 1;
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        
        while(ptr1 >= 0 && ptr2 >= 0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[put] = nums1[ptr1];
                put--;ptr1--;
            } else {
                nums1[put] = nums2[ptr2];
                put--;ptr2--;
            }
        }
        
        while(ptr2 >= 0){
             nums1[put] = nums2[ptr2];
             put--;ptr2--;
        }
    }
}