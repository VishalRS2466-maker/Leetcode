class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;          // pointer at the last valid index of nums1
        int p2 = n - 1;          // pointer at the last valid index of nums2
        int ptotal = m + n - 1;  // pointer at the last index of nums1
//skipping the 0 element and Continue only while BOTH arrays have elements left to compare.
        while (p1 >= 0 && p2 >= 0) // if we use > 0, it skips the 0th element
        {
            if (nums1[p1] > nums2[p2]) 
            {
                nums1[ptotal] = nums1[p1];
                p1--; // to check the second element from the last index of nums1
            }
            else
            {
                nums1[ptotal] = nums2[p2];
                p2--; // to check the second element from the last index of nums2
            }

            ptotal--;
        }

 // copy the remaining elements from nums2 
 //There is no comparison here because nums1 has already run out of elements. if nums1={0,0}this loop run
        while (p2 >= 0)
        {
            nums1[ptotal] = nums2[p2];
            p2--;
            ptotal--;
        }
    }
}
