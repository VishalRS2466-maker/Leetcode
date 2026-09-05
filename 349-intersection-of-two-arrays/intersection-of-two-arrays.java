class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length];
        int count = 0;

        for (int i = 0; i < nums1.length; i++)
         {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {  // check if nums1[i] exists in nums2
                    found = true;
                    break;
                }
            }

            if (found) { //after element found i.e., found==true
                boolean alreadyAdded = false;
                for (int k = 0; k < count; k++)//checking temp and nums1
                 { // after found checking whether we already added it
                    if (temp[k] == nums1[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    temp[count] = nums1[i];
                    count++;
                }
            }
        }

        //temp cannot be printed since it's size is
        int[] result = new int[count];//op size

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];//op output
        }

        return result;
    }
}