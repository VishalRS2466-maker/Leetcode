class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;//1st largest 
        int max2=0;//second largest
        int n=nums.length;//cosidering last element too
        for (int i=0; i<n ;i++)
        {
            if(max1<=nums[i])
            {
                max2=max1;
                max1=nums[i];
              // error possibility 1st max1=nums[i]; and next  max2=max1; here max2 is nums[i] not max1
            }
            else if(nums[i]>max2)//if max2>nums[i] but nums[i] and max2 is lesser than max1
            {
                max2=nums[i];
            }
        }
        int max=(max1-1)*(max2-1);
        return max;
        
    }
}