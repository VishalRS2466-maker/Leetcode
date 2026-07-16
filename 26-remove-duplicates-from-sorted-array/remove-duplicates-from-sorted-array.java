class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }

        int k=1;//k starts at 1 because the first element is already unique.

       
        for (int i=1;i<nums.length;i++) //i=1 because anyhow first element would be the same for i/p and o/p
        {
         if (nums[i] != nums[k-1]) //if it is k it is 1st index hence k-1
         { 
            nums[k] = nums[i];  //Overwrite the next unique element
            //Errror possibility :nums[i]=nums[k]; 
              k++;  

         }
        }
        return k;  //k always stores the count of unique elements therefore, you return k directly.
        //coded by Vishal R S
    }
}




/*
There are two valid approaches:

k represents	       Initial value	Compare with	Write to	Return
Last unique index	       0	             nums[k]	nums[++k]	k + 1
Unique count	           1	           nums[k - 1]	nums[k]	       k      */  